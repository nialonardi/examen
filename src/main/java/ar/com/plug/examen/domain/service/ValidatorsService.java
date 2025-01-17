package ar.com.plug.examen.domain.service;

import ar.com.plug.examen.domain.exception.BadRequestException;
import ar.com.plug.examen.domain.model.Status;
import ar.com.plug.examen.domain.model.Transaction;

public interface ValidatorsService {

	void validateTransactionStatus(Transaction transaction, Status status) throws BadRequestException;

	boolean checkCompleteObject(Object object, boolean skipId) throws BadRequestException;

}