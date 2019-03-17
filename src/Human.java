public class Human {
    private final String name;
    private final int yearOfBirth;
    private final int hairColor;
    private final int height;
    private final int weight;
    private final boolean hasChildren;

    public static class Builder {
        private final String name;
        private final int yearOfBirth;
        private int hairColor = 0;
        private int height = 0;
        private int weight = 0;
        private boolean hasChildren = false;

        public Builder(String name, int yearOfBirth) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }

        public Builder hairColor(int value) {
            hairColor = value;
            return this;
        }

        public Builder height(int value) {
            height = value;
            return this;
        }

        public Builder weight(int value) {
            weight = value;
            return this;
        }

        public Builder hasChildren(boolean value) {
            hasChildren = value;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }

    private Human(Builder builder) {
        name = builder.name;
        yearOfBirth = builder.yearOfBirth;
        hairColor = builder.hairColor;
        height = builder.height;
        weight = builder.weight;
        hasChildren = builder.hasChildren;
    }
}
