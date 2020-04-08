package ru.progwards.t9.t9_1;

import java.util.Comparator;

public class FiguresIComparator extends NestedFigures {
    //свойства
    private Figure[] figures;
    public Comparator figuresComparator = new Comparator<Figure>() {
        @Override
        public int compare(Figure o1, Figure o2) {
            return o1.compareTo(o2);
        }
    };

    //методы
    FiguresIComparator(Figure[] figures) {
        this.figures = figures;
    }

    FiguresIComparator(Figure[] figures, Comparator<Figure> fc) {
        this(figures);
        figuresComparator = fc;
    }

    Figure getMaxFigure() {
        Figure result = null;
        for (Figure figure : figures) {
            if (result == null || figuresComparator.compare(figure, result) > 0)
                result = figure;
        }
        return result;
    }
}
