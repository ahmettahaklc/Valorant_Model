package org.example;

public enum Rank {

    IRON_1("Iron 1"),
    IRON_2("Iron 2"),
    IRON_3("Iron 3"),
    BRONZE_1("Bronze 1"),
    BRONZE_2("Bronze 2"),
    BRONZE_3("Bronze 3"),
    SILVER_1("Silver 1"),
    SILVER_2("Silver 2"),
    SILVER_3("Silver 3"),
    GOLD_1("Gold 1"),
    GOLD_2("Gold 2"),
    GOLD_3("Gold 3"),
    PLATINUM_1("Platinum 1"),
    PLATINUM_2("Platinum 2"),
    PLATINUM_3("Platinum 3"),
    DIAMOND_1("Diamond 1"),
    DIAMOND_2("Diamond 2"),
    DIAMOND_3("Diamond 3"),
    IMMORTAL_1("Immortal 1"),
    IMMORTAL_2("Immortal 2"),
    IMMORTAL_3("Immortal 3"),
    RADIANT("Radiant");


    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }


}
