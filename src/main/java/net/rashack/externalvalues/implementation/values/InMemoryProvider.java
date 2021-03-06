package net.rashack.externalvalues.implementation.values;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import net.rashack.externalvalues.provider.ValueProvider;

public class InMemoryProvider implements ValueProvider {
	private final ConcurrentMap<String, String> loadedValues = new ConcurrentHashMap<>();

	@Override
	public Optional<String> forKey(final String key) {
		return Optional.ofNullable(loadedValues.get(key));
	}

	public InMemoryProvider registerValue(final String key, final String value) {
		loadedValues.put(key, value);
		return this;
	}
}
