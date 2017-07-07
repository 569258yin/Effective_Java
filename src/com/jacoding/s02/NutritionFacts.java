package com.jacoding.s02;

/**
 * �ص�������ģʽ  
 * <p>
 * 1.��ֹ��������࣬���������в������ݲ�һ�µ��µĹ��������࣬��������
 * <p>
 * 2.��ֹ���ڹ��������ɶ���ʱ���ٵ��ö��set���������¶���һ�£������ڶ��߳������
 * 
 * <p>
 * ������д
 * 1.����һ���ڲ��� Builder������������(Ҳ�ɲ�������)
 * 2.�ṩ��������ֵ��Ϊ�ڲ������
 * 3.�ṩһ�����������������������ʵ��new ���࣬�����ڲ������
 * 4.�������ṩ���������ݲ����ڲ�����󣬲����ڲ���������ȡ����������
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
		//���봫�ݵĲ���
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



