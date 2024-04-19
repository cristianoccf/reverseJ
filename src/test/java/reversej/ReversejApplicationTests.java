package reversej;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import acceptance.StoryClassAndSequenceDiagram;
import acceptance.story.Story;
import reversej.diagram.DiagramEngine;
import reversej.diagram.DiagramStrategy;
import reversej.diagram.InformationFactory;
import reversej.diagram.informationmodel.InformationFactoryImpl;
import reversej.diagram.strategies.ClassDiagram;
import reversej.diagram.strategies.SequenceDiagram;
import reversej.repository.RepositoryInMemory;
import reversej.tracer.TracerController;

@SpringBootTest
class ReversejApplicationTests {

	@Test
	void storyTestClassAndSequence() {
//		RepositoryInMemory repository = new RepositoryInMemory();
//		InformationFactory factory = new InformationFactoryImpl();
//		List<DiagramStrategy> strategies = new LinkedList<DiagramStrategy>();
//		strategies.add(new ClassDiagram());
//		strategies.add(new SequenceDiagram());
//		DiagramEngine engine = new MakerAndSaver(repository, factory, strategies);
//		String fileName = Thread.currentThread().getStackTrace()[1].getFileName();
//		((MakerAndSaver) engine).setFileName(fileName);
//		TracerController.start(repository);
//		Story s = new Story();
//		s.tellStory();
//		TracerController.stop();
//		engine.make();
		
		new StoryClassAndSequenceDiagram().test();
		Assertions.assertTrue(true);
	}

}
