package dbutil;

import java.sql.ResultSet;

public interface IResultMapper<T> {
	T resultMapping(ResultSet rs);
}
