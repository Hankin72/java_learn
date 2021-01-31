
/*
 步骤 1 : 设计英雄这个类顶折
 类：英雄
 状态（属性）：名字，血量，护甲，移动速度
  步骤 2 : 创建具体的英雄
  类就像一个模版，根据这样一个模版，可以创建一个个具体的英雄，（即对象）
  new Hero() 就是java中创建一个英雄对象的意思
 */


public class Hero {
    String name; // 姓名
    float hp; // 血量
    float armor; // 护甲
    int moveSpeed; // 移动速度


    // 坑队友
    void keng(){
        System.out.println("坑队友!!!");
    }
    //获取护甲值
    float getArmor(){
        return armor;
    }
    //增加移动速度
    void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }
    public void legendary(){
        System.out.println("超神");
    }

    public float getHp(){
        return hp;
    }
    public void recovery(float blood) {
        hp = hp + blood;
    }

    public static void main(String[] agrs){
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        garen.addSpeed(100);

        System.out.println("没加血之前的血量：" + garen.getHp());

        System.out.println("回血100.");
        garen.recovery(100);

        System.out.println("加血之后的血量：" + garen.getHp());
        garen.legendary();
        garen.keng();

    }
}
