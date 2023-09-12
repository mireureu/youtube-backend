package com.kh.youtube.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscribe {

	@Id
	@Column(name="subs_code")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "subSeq")
	@SequenceGenerator(name = "subSeq", sequenceName = "SEQ_SUBSCRIBE", allocationSize = 1)
	private int subsCode;

	@Column(name="subs_date")
	private Date subsDate;

	@ManyToOne
	@JoinColumn(name="id")
	private Member member;

	@ManyToOne
	@JoinColumn(name="channel_code")
	private Channel channel;
	

}
