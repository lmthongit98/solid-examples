package lsp;

public class LSPExample2 {
    interface FileService {
        void getFiles();
        void deleteFiles();
    }

    class ImageFileService implements FileService {

        @Override
        public void getFiles() {
            // Load image files
        }

        @Override
        public void deleteFiles() {
            // Delete image files
        }
    }

    class TempFileService implements FileService {

        @Override
        public void getFiles() {
            // Load temp files
        }

        @Override
        public void deleteFiles() {
            // Delete temp files
        }
    }

    class SystemFileService implements FileService {

        @Override
        public void getFiles() {
            // Load temp files
        }

        @Override
        public void deleteFiles() {
            throw new UnsupportedOperationException();
        }
    }

}
