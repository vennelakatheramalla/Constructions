package mapExamples;
public interface OuterInterface {

	void add(Object obj);

	interface InnerInterface {

		Object entry(Object key, Object value);
	}

}