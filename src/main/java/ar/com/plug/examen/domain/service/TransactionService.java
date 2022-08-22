package ar.com.plug.examen.domain.service;

import java.util.List;

import ar.com.plug.examen.app.api.TransactionApi;
import ar.com.plug.examen.domain.exception.BadRequestException;
import ar.com.plug.examen.domain.exception.NotFoundException;
import ar.com.plug.examen.domain.model.Status;

public interface TransactionService {

	List<TransactionApi> listAll();

	TransactionApi save(TransactionApi transaction) throws BadRequestException, NotFoundException;

	void deleteById(long id) throws NotFoundException;

	TransactionApi updateTransactionStatusById(long id, Status status) throws NotFoundException, BadRequestException;

}