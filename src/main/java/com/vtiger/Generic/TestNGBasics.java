package com.vtiger.Generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics 
{
	@BeforeSuite
	public void America()
	{
		System.out.println("@BeforeSuite---Amir Khan");
	}
	
	@BeforeTest
	public void Tippu_Sultan()
	{
		System.out.println("@BeforeTest---Tippu");
	}
	
	@BeforeClass
	public void Captain()
	{
		System.out.println("@BeforeClass---MS DHONI");
	}
	
	@BeforeMethod
	public void MegaStar()
	{
		System.out.println("@BeforeMethod---Chiru");
	}
	
	@Test(priority = 1)
	public void Srikanth()
	{
		System.out.println("@Test1---Srikanth");
	}
	
	@Test(priority = 2)
	public void PawanKalyan()
	{
		System.out.println("@Test2---PawanKalyan");
	}
	
	@Test(priority = 0)
	public void TholiPrema()
	{
		System.out.println("@Test3---TholiPrema");
	}
	
	@AfterMethod
	public void Kushi()
	{
		System.out.println("@AfterMethod---Thiru");
	}
	
	@AfterClass
	public void Cap()
	{
		System.out.println("@AfterClass---King");
	}
	
	@AfterTest
	public void Tip()
	{
		System.out.println("@AfterTest---Thop");
	}
	
	@AfterSuite
	public void Americ()
	{
		System.out.println("@AfterSuite---USA");
	}
}

