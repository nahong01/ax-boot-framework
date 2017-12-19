package com.chequer.axboot.admin.domain.boardPro;
 
import com.chequer.axboot.core.annotations.ColumnPosition;
import com.chequer.axboot.admin.domain.SimpleJpaModel;
import lombok.*;
import org.apache.ibatis.type.Alias;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.chequer.axboot.core.annotations.Comment;
import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
 
@Setter
@Getter
@DynamicInsert
@DynamicUpdate
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "board_pro")
@Comment(value = "")
@Alias("boardPro")
public class BoardPro extends SimpleJpaModel {
	@Id
	@Column(name = "bno", precision = 10, nullable = false)
	@Comment(value = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bno;
	@Column(name = "subject", length = 50, nullable = false)
	@Comment(value = "")
	private String subject;
	@Column(name = "content", length = 65535, nullable = false)
	@Comment(value = "")
	private String content;
	@Column(name = "writer", length = 50, nullable = false)
	@Comment(value = "")
	private String writer;
	@Column(name = "reg_date")
	@Comment(value = "")
	private LocalDateTime regDate;
	@Column(name = "hit", precision = 10)
	@Comment(value = "")
	private Integer hit;
    @Override
    public Integer getId() {
        return bno;
    }
}