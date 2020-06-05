package com.foo.test_record_vector;
import com.foo.test_record_vector.data_bus_dim_test;

public class PR_sub_rec extends data_bus_dim_test implements java.io.Serializable 
{

	static final long serialVersionUID = 1L;

	public PR_sub_rec() {
	}

	private java.lang.String data_country;
	private java.lang.String data_business;
	private java.util.List<com.foo.test_record_vector.data_bus_dim_test> data_bus_dim_test;

	public java.lang.String getData_country()
	{
		return this.data_country;
	}

	public void setData_country(java.lang.String data_country)
	{
		 this.data_country = data_country;
	}

	public java.lang.String getData_business()
	{
		return this.data_business;
	}

	public void setData_business(java.lang.String data_business)
	{
		 this.data_business = data_business;
	}
	
	public java.util.List<com.foo.test_record_vector.data_bus_dim_test> getData_bus_dim_test()
	{
		return this.data_bus_dim_test;
	}

	public void setData_bus_dim_test(java.util.List<com.foo.test_record_vector.data_bus_dim_test> data_bus_dim_test)
	{
		 this.data_bus_dim_test = data_bus_dim_test;
	}
	
		
	public java.lang.Long get_index(java.lang.Long index_cnt) {
	    
	    //public java.lang.Long temp_level;
	    
	   // temp_level=
	    
	    return give_level(index_cnt);
	    
	}
}
