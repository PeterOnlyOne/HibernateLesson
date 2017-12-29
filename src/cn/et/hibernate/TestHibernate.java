package cn.et.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.et.hibernate.dao.Food;

public class TestHibernate {

	public static void main(String[] args) {
//		saveFood();
//		deleteFood();
//		queryFood();
		updateFood();
	}
	/**
	 * ���Ӳ�Ʒ
	 */
	public static void saveFood(){
		Session session = HibernateSessionFactory.getSession();
		Food food = new Food();
		food.setFoodname("���");
		food.setPrice(10.0);
		food.setImagepath("a.png");
		session.getTransaction().begin();
		session.save(food);
		session.getTransaction().commit();
	}
	/**
	 * ɾ����Ʒ
	 */
	public static void deleteFood(){
		Session session = HibernateSessionFactory.getSession();
		Food food = new Food();
		food.setFoodid(7);
		session.getTransaction().begin();
		session.delete(food);
		session.getTransaction().commit();
	}
	/**
	 * ��ѯ��Ʒ
	 */
	public static void queryFood(){
		Session session = HibernateSessionFactory.getSession();
		Food food = (Food) session.load(Food.class, 2);
		System.out.println(food.getFoodname());
		
		Query query = session.createQuery("from Food where foodname like '%��%'");
		List<Food> list = query.list();
		System.out.println(list.size());
	}
	/**
	 * ���²�Ʒ
	 */
	public static void updateFood(){
		Session session = HibernateSessionFactory.getSession();
		Food food = (Food) session.load(Food.class, 5);
		food.setFoodname("��Ѽ");
		food.setPrice(42.0);
		food.setImagepath("b.png");
		session.getTransaction().begin();
		session.update(food);
		session.getTransaction().commit();
	}
}
