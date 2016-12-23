# CompositionTool
Tool written in Java and using swing for modelling the composition (i.e. visual arrangement) of images. 

Images can be traced over by selecting and then drawing particular shapes or 'tracings' from the menu, e.g. line, rectangle, circle over the image. All these shapes are instantiations of either the GeneralTracing class or extensions of it, which itself extends the JLabel class. Shapes can be resized using the DragTab JLabels. The image itself is an instantiation of the ImageJLab class, also extending JLabel. 

Images and their 'tracings' are saved by serializing them as a SerializableComposite object using the SerializableComReader class extending MouseAdapter. 

[h1]The main class is CompositorA1 and a list of tasks and potential changes can be found as comments at the top of the class. Informative comments are in lower case, whilst temporary comments are in upper case. PanelA1 contains all the swing presentation components. [/h1]

I am also learning JUnit testing concurrently with the creation of this project and I hope to implement a fuller testing framework over time.
    
The next step in the project is to be able to mathematically model GeneralTracing objects (probably using the JTS library), e.g. by finding the equation of a certain line tracing or the area of a circle tracing, with the ultimate vision being to derive insights from these mathematical models, e.g. by creating an algorithm which uses the geometric data to compare two images and come up with a 'similarity index' or an algorithm that can make composition suggestions based on liked images. Such functions would likely be extremely complex but what is important to me is that this application has a lot of scope for development.
