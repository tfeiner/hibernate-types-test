package cc.feiner;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "myentity")
@TypeDef(
		name = "list-array",
		typeClass = ListArrayType.class
)
public class MyEntity {

	@Id
	private Long id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "tags", columnDefinition = "array")
	@Type(type = "list-array")
	private List<String> tags;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
