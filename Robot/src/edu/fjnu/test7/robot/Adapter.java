/**
 * 
 */
package edu.fjnu.test7.robot;

/**
 * @author guoyumei
 *
 */
public class Adapter implements Robot {

	/* (non-Javadoc)
	 * @see edu.fjnu.test7.robot.Robot#run()
	 */
	Adapter(){
		bird = new Bird();
		dog = new Dog();
	}
	private Bird bird;
	private Dog dog;
	@Override
	public void run() {
		System.out.println("机器人模仿:");
		this.dog.run();
	}

	/* (non-Javadoc)
	 * @see edu.fjnu.test7.robot.Robot#cry()
	 */
	@Override
	public void cry() {
		System.out.println("机器人模仿:");
		this.bird.cry();
	}

}
