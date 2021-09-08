package com.hsbc.staffmanagement.storage;

import com.hsbc.staffmanagement.exception.InvalidStorageTypeException;

public class StorageFactory {
	public static Storage getStorage(int code) throws InvalidStorageTypeException {
//		StorageImpl storage = new StorageImpl();
//		return storage;
		if(code == 1) {
			return new StorageImpl(); 
		}
		else if(code == 2) {
			return new StorageListImpl();
		}
		else if(code == 3) {
			return new StorageSortedImpl();
		}
		else if(code == 4) {
			return new StorageMapImpl();
		}
		else throw new InvalidStorageTypeException("Invalid Age");
	}
}
