package br.com.solid.model;

public enum Office {

	ASSISTANT {
		@Override
		public Office getNextOffice() {
			return ANALYST;
		}
	},
	ANALYST {
		@Override
		public Office getNextOffice() {
			return SPECIALIST;
		}
	},
	SPECIALIST {
		@Override
		public Office getNextOffice() {
			return MANAGER;
		}
	},
	MANAGER {
		@Override
		public Office getNextOffice() {
			// TODO Auto-generated method stub
			return MANAGER;
		}
	};

	public abstract Office getNextOffice();

}
