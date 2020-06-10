package com.foo.test_record_vector;

public class PR_sub_rec_new implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	public PR_sub_rec_new() {
	}

	private java.lang.String data_country;
	private java.lang.String data_business;
	private java.util.List<com.foo.test_record_vector.bus_dim> temp_fld;
	public java.lang.String sub_data_fetch() {
		com.foo.test_record_vector.bus_dim bus_dim_nested_only;
		bus_dim_nested_only = temp_fld.get(1);
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

	public java.util.List<com.foo.test_record_vector.bus_dim> getTemp_fld() {
		return this.temp_fld;
	}

	public void setTemp_fld(
			java.util.List<com.foo.test_record_vector.bus_dim> temp_fld) {
		this.temp_fld = temp_fld;
	}

}
