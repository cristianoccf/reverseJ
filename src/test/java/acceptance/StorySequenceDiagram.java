package acceptance;

import java.util.LinkedList;
import java.util.List;

import acceptance.story.Story;
import reversej.MakerAndSaver;
import reversej.diagram.DiagramEngine;
import reversej.diagram.DiagramStrategy;
import reversej.diagram.InformationFactory;
import reversej.diagram.informationmodel.InformationFactoryImpl;
import reversej.diagram.strategies.SequenceDiagram;
import reversej.repository.RepositoryInMemory;
import reversej.tracer.TracerController;

public class StorySequenceDiagram {
	public static void main(String[] args) {
		RepositoryInMemory repository = new RepositoryInMemory();
		InformationFactory factory = new InformationFactoryImpl();
		List<DiagramStrategy> strategies = new LinkedList<DiagramStrategy>();
		strategies.add(new SequenceDiagram());
		DiagramEngine dM = new MakerAndSaver(repository, factory, strategies);
		String fileName = Thread.currentThread().getStackTrace()[1].getFileName();
		((MakerAndSaver) dM).setFileName(fileName);
		TracerController.start(repository);

		Story s = new Story();
		s.tellStory();

		TracerController.stop();
		dM.make();
	}
}
