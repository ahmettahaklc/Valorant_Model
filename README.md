# Valorant OOP Model 🎮

This project is a simulation where I modeled the core mechanics, objects, and in-game structures of the popular FPS game Valorant using **Java** and **Object-Oriented Programming (OOP)** principles. 

My goal is to code a complex game ecosystem hierarchically using Clean Architecture and OOP concepts (Inheritance, Polymorphism, Abstraction, Encapsulation).

## 🏗️ Project Architecture and Features

The project is divided into modular packages according to the actual game logic:

### 🦸‍♂️ Agents and Roles (`agent` package)
- Agents (`Astra`, `Cypher`, `Omen`, `Sage`, `Yoru`, etc.) inherit from the main `Agent` abstract class.
- Each agent has an assigned `Role` enum (DUELIST, SENTINEL, CONTROLLER, INITIATOR).

### 🔮 Skill System (`skill` package)
Skills are designed hierarchically according to the game's structure:
- **Core Interface:** The `Skill` interface ensures every skill has a `use()` method.
- **Skill Types:** `BasicSkill`, `SignatureSkill`, and `UltimateSkill`.
- **Recharge Mechanics:** Signature skills are further separated based on their recharge logic:
  - `CooldownSkill`: Skills that recharge after a certain time (seconds) (e.g., Omen's 'E' or Cypher's Spycam).
  - `KillRechargeSkill`: Skills that recharge when the player gets a kill (e.g., Yoru's GateCrash).

### 🔫 Weapons and Skins (`gun` package)
- **Weapons:** Weapons like `Operator`, `Phantom`, and `Vandal` inherit from the `Gun` class and have their own damage (body, leg, head) and price attributes.
- **Skins:** Skins like `ElderFlame` and `PrimeVandal` are integrated into weapons using a `Skin` interface.

### ⚙️ Core Game Mechanics
- **Player & User:** `User` logic (VP, RP, username) and in-game `Player` logic (HP, Shield, Taking Damage) are isolated from each other.
- **Environment Variables:** Game data like `Map`, `Rank`, and `Server` are securely managed using Enum formats.

## 🛠️ Technologies Used

* **Language:** Java (JDK 17+)
* **Build Tool:** Gradle (Kotlin DSL `build.gradle.kts`)
* **Paradigm:** Object-Oriented Programming (OOP)

## 🚀 Installation and Execution

To run the project on your local machine:

1. Clone the repository:
   ```bash
   git clone [https://github.com/YOUR_USERNAME/valorant_model.git](https://github.com/YOUR_USERNAME/valorant_model.git)
