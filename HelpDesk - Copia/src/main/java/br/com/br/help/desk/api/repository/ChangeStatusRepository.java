package br.com.br.help.desk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.br.help.desk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
	
	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);

}
