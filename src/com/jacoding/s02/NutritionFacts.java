package com.jacoding.s02;

/**
 * 重叠构造器模式  
 * <p>
 * 1.防止因参数过多，而构造器中参数传递不一致导致的构造器过多，代码冗余
 * <p>
 * 2.防止由于构造器生成对象时，再掉用多个set方法，导致对象不一致，尤其在多线程情况下
 * 
 * <p>
 * 代码书写
 * 1.产生一个内部类 Builder包含所有属性(也可部分属性)
 * 2.提供方法返回值均为内部类对象
 * 3.提供一个方法返回主类对象，在其中实现new 主类，传入内部类对象
 * 4.主类中提供方法，传递参数内部类对象，并将内部类中属性取出进行设置
 * @author YH
 *
 */
public class NutritionFacts {
	private final int serviingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder{
		//必须传递的参数
		private final int serviingSize;
		private final int servings;
		
		private  int calories = 0;
		private  int fat = 0;
		private  int sodium = 0;
		private  int carbohydrate = 0;
		
		public Builder(int servingSize,int servings) {
			this.serviingSize = servingSize;
			this.servings = servings;
		}
		public Builder calories(int val){
			calories = val; 
			return this;
		}
		public Builder fat(int val){
			fat = val; 
			return this;
		}
		public Builder sodium(int val){
			sodium = val; 
			return this;
		}
		public Builder carbohydrate(int val){
			carbohydrate = val; 
			return this;
		}
		
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
		
	}
	
	
	public NutritionFacts(Builder builder) {
		serviingSize = builder.serviingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}


	@Override
	public String toString() {
		return "NutritionFacts [serviingSize=" + serviingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}
	
	
	
}	



