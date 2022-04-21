package managers;

import data_provider.config_file_reader;

public class file_reader_manager {
    static file_reader_manager FileReaderManager = new file_reader_manager();
    static config_file_reader ConfigFileReader;

    private file_reader_manager() {

    }

    public static file_reader_manager getInstance() {
        return FileReaderManager;
    }

    public config_file_reader getConfigFileReader() {
        return (ConfigFileReader == null) ? new config_file_reader() : ConfigFileReader;
    }
}
