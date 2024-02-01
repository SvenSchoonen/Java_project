/*
 * Copyright (c) 2015 Michiel Noback [michiel.noback@gmail.com].
 * All rights reserved.
 */

package section3_apis.part3_protein_sorting;

import java.util.Comparator;

/**
 *
 * @author Michiel Noback [michiel.noback@gmail.com]
 * @version 0.0.1
 */
public class Protein implements Comparable<Protein> {
    private final String name;
    private final String accession;
    private final String aminoAcidSequence;
    private GOannotation goAnnotation;

    /**
     * constructs without GO annotation;
     * @param name the protein name
     * @param accession the accession number
     * @param aminoAcidSequence the proteins amino acid sequence
     */
    public Protein(String name, String accession, String aminoAcidSequence) {
        this.name = name;
        this.accession = accession;
        this.aminoAcidSequence = aminoAcidSequence;
    }

    /**
     * constructs with main properties.
     * @param name the protein name
     * @param accession the accession number
     * @param aminoAcidSequence the proteins amino acid sequence
     * @param goAnnotation the GO annotation
     */
    public Protein(String name, String accession, String aminoAcidSequence, GOannotation goAnnotation) {
        this.name = name;
        this.accession = accession;
        this.aminoAcidSequence = aminoAcidSequence;
        this.goAnnotation = goAnnotation;
    }

    @Override
    public int compareTo(Protein other) {
        //YOUR CODE HERE (and remove the throw statement)
        //delegates to class String
        return this.name.compareTo(other.name);
    }
    
    /**
     * provides a range of possible sorters, based on the type that is requested.
     * @param type the sorting type that is required
     * @return proteinSorter
     */
    public static Comparator<Protein> getSorter(SortingType type) {
        //YOUR CODE HERE (and remove the throw statement)
        if (type == null) throw new IllegalArgumentException("no such type supported: " + type);
        switch (type) {
            case PROTEIN_NAME: {
                return new Comparator<Protein>() {
                    @Override
                    public int compare(Protein o1, Protein o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                };
                //OR, with lambda
                //return (o1, o2) -> o1.getName().compareTo(o2.getName());
            }
            case ACCESSION_NUMBER: {
                //as lambda
                return (o1, o2) -> o1.getAccession().toLowerCase().compareTo(o2.getAccession().toLowerCase());
            }
            case GO_ANNOTATION: {

            }

            default: throw new IllegalArgumentException("no such type supported: " + type);
        }
    }

    /**
     *
     * @return name the protein name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return accession the accession number
     */
    public String getAccession() {
        return accession;
    }

    /**
     *
     * @return aminoAcidSequence the amino acid sequence
     */
    public String getAminoAcidSequence() {
        return aminoAcidSequence;
    }

    /**
     *
     * @return GO annotation
     */
    public GOannotation getGoAnnotation() {
        return goAnnotation;
    }

    @Override
    public String toString() {
        return "Protein{" + "name=" + name + ", accession=" + accession + ", aminoAcidSequence=" + aminoAcidSequence + '}';
    }

}
