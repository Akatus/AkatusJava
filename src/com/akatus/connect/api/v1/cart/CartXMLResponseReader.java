package com.akatus.connect.api.v1.cart;

import com.akatus.connect.api.AkatusResponse;
import com.akatus.connect.api.v1.AkatusXMLResponseBuilder;

class CartXMLResponseReader extends AkatusXMLResponseBuilder {
	@Override
	protected AkatusResponse createAkatusResponse() {
		return new CartResponse();
	}

	@Override
	protected void readResponse(AkatusResponse akatusResponse) {
		super.readResponse(akatusResponse);

		((CartResponse) akatusResponse).setCart(getCart());
		((CartResponse) akatusResponse).setReference(getReference());
		((CartResponse) akatusResponse).setTransaction(getTransaction());

	}

	private String getCart() {
		return getNodeTextValue("carrinho");
	}

	private String getReference() {
		return getNodeTextValue("referencia");
	}

	private String getTransaction() {
		return getNodeTextValue("transacao");
	}
}