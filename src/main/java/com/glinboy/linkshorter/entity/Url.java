package com.glinboy.linkshorter.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
//@formatter:off
@Table(
    uniqueConstraints = {
      @UniqueConstraint(name = "UNQ_CODE", columnNames = { "CODE" }),
      @UniqueConstraint(name = "UNQ_ORGINAL", columnNames = { "ORIGINAL" })
  },
  indexes = {
      @Index(name = "INDX_CODE", columnList = "code"),
        @Index(name = "INDX_ORGINAL", columnList = "original")
  })
//@formatter:on
public class Url {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "CODE", nullable = false)
  private String code;

  @Column(name = "ORIGINAL", nullable = false)
  private String original;

  @CreatedDate
  @Column(name = "CREATED_AT", nullable = false)
  private LocalDateTime createdAt;

  @LastModifiedDate
  @Column(name = "UPDATED_AT", nullable = false)
  private LocalDateTime updatedAt;
}
