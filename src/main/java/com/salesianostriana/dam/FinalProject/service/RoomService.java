package com.salesianostriana.dam.FinalProject.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.FinalProject.model.Room;
import com.salesianostriana.dam.FinalProject.repositories.RoomRepository;
import com.salesianostriana.dam.FinalProject.servicebase.BaseServiceImp;

@Service
public class RoomService 
	extends BaseServiceImp<Room, Long, RoomRepository>{

}
