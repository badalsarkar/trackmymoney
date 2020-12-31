package ca.badalsarkar.trackmymoney;

public interface DataLoader {
	<T>T load(String filePath);
}
