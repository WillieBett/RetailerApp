/**
 * 
 */
package com.openstack.retailer.dtos;

import lombok.Data;

/**
 * @author Rakesh Muppa <rake.kv93@gmail.com>
 *
 * Created On Jul 6, 2017
 * 
 */
@Data
public class SuccessResponse extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7185946916910136148L;

	private int status;
	private String message;
}
