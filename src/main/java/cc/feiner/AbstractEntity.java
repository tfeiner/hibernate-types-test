package cc.feiner;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
@TypeDef(
		name = "list-array",
		typeClass = ListArrayType.class
)
public abstract class AbstractEntity {

	@Column(name = "tags", columnDefinition = "text[]")
	@Type(type = "list-array")
	private List<String> tags;

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
