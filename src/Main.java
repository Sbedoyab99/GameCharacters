//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter();
        Weapon warriorWeapon = warriorFactory.createWeapon();
        Clothes warriorArmor = warriorFactory.createClothes();

        System.out.println("Creating Warrior character and equipment:");
        warrior.displayInfo();
        warriorWeapon.displayInfo();
        warriorArmor.displayInfo();

        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter();
        Weapon mageWeapon = mageFactory.createWeapon();
        Clothes mageArmor = mageFactory.createClothes();

        System.out.println("\nCreating Mage character and equipment:");
        mage.displayInfo();
        mageWeapon.displayInfo();
        mageArmor.displayInfo();
    }
}