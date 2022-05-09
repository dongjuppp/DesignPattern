package struct.bridge;

public abstract  class Unit {
    private Skill skill;
    private Skin skin;

    public void setSkill(Skill skill){
        this.skill = skill;
    }

    public void setSkine(Skin skin){
        this.skin = skin;
    }

    public void action(){
        skin.print();
        skill.execute();
    }
}
