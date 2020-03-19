package com.app;

public class SudhirPro {
				private int i;
				public int getI() {
					return i;
				}
				public void setI(int i) {
					this.i = i;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public String getAddress() {
					return address;
				}
				public void setAddress(String address) {
					this.address = address;
				}
				private String name;
				private String address;
				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + ((address == null) ? 0 : address.hashCode());
					result = prime * result + i;
					result = prime * result + ((name == null) ? 0 : name.hashCode());
					return result;
				}
				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					SudhirPro other = (SudhirPro) obj;
					if (address == null) {
						if (other.address != null)
							return false;
					} else if (!address.equals(other.address))
						return false;
					if (i != other.i)
						return false;
					if (name == null) {
						if (other.name != null)
							return false;
					} else if (!name.equals(other.name))
						return false;
					return true;
				}
				
}
