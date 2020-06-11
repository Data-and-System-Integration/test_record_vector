package com.foo.test_record_vector;

public class PR_sub_rec_new implements java.io.Serializable {

	static final long serialVersionUID = 1L;



	public PR_sub_rec_new() {
	}

	private java.lang.String data_country;
	private java.lang.String data_business;
    private java.util.List<com.foo.test_record_vector.bus_dim> bus_dim_list_field;
	private com.foo.test_record_vector.bus_dim bus_dim_simple_fld;
	
	public java.lang.String sub_data_fetch() {
		com.foo.test_record_vector.bus_dim bus_dim_nested_only;
		bus_dim_nested_only = bus_dim_list_field.get(1);
		String get_LEVEL = bus_dim_nested_only.getDim_name();
		return get_LEVEL;
		// return 'SUCC';
	}
	public java.lang.String getData_country() {
		return this.data_country;
	}

	public void setData_country(java.lang.String data_country) {
		this.data_country = data_country;
	}

	public java.lang.String getData_business() {
		return this.data_business;
	}

	public void setData_business(java.lang.String data_business) {
		this.data_business = data_business;
	}

	public java.util.List<com.foo.test_record_vector.bus_dim> getBus_dim_list_field() {
		return this.bus_dim_list_field;
	}
	public void setBus_dim_list_field(
			java.util.List<com.foo.test_record_vector.bus_dim> bus_dim_list_field) {
		this.bus_dim_list_field = bus_dim_list_field;
	}
	public com.foo.test_record_vector.bus_dim getBus_dim_simple_fld() {
		return this.bus_dim_simple_fld;
	}
	public void setBus_dim_simple_fld(
			com.foo.test_record_vector.bus_dim bus_dim_simple_fld) {
		this.bus_dim_simple_fld = bus_dim_simple_fld;
	}

}
