//package com.company.streamapi;
//
//import java.util.*;
//import java.util.function.BiConsumer;
//import java.util.function.BinaryOperator;
//import java.util.function.Function;
//import java.util.function.Supplier;
//import java.util.stream.Collector;
//
//public class Assignment5{
//
//    Collector<Integer,?,Integer> custom = new Collector<Integer, Object, Integer>() {
//        @Override
//        public Supplier<Object> supplier() {
//            return null;
//        }
//
//        @Override
//        public BiConsumer<Object, Integer> accumulator() {
//            return null;
//        }
//
//        @Override
//        public BinaryOperator<Object> combiner() {
//            return null;
//        }
//
//        @Override
//        public Function<Object, Integer> finisher() {
//            return null;
//        }
//
//        @Override
//        public Set<Characteristics> characteristics() {
//            return null;
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
////    public static <T> Collector<T, List<T>, List<T>> list() {
////        return new Collector<T, List<T>, List<T>>() {
////            @Override
////            public Supplier<List<T>> supplier() {
////                return ArrayList::new;
////            }
////
////            @Override
////            public BiConsumer<List<T>, T> accumulator() {
////                return List::add;
////            }
////
////            @Override
////            public BinaryOperator<List<T>> combiner() {
////                return (list1, list2) -> {
////                    list1.addAll(list2);
////                    return list1;
////                };
////            }
////
////            @Override
////            public Function<List<T>, List<T>> finisher() {
////                return Collections::list;
////            }
////
////
////        };
////    }
//
//
////    public static <T> Collector<T, ?, Set<T>> toTreeSet() {
////        return Collector.of(
////                TreeSet::new, // Supplier: creates a new TreeSet
////                Set::add,     // Accumulator: adds an element to the TreeSet
////                (left, right) -> { // Combiner: merges two TreeSets
////                    left.addAll(right);
////                    return left;
////                },
////                Collector.Characteristics.UNORDERED // Characteristics
////        );
////    }
//
////    Collector <Integer,?,Integer> custom = Collector.of(
////            () -> new Integer[]{1},
////
////    )
//
////    public static void main(String[] args) {
////
//////        Set<String> sortedSet = Arrays.asList("banana", "apple", "orange", "apple")
//////                .stream()
//////                .collect(Assignment5.toTreeSet());
//////
//////        System.out.println(sortedSet); // Output: [apple, banana, orange]
////
////
////    }
//
//
//
//}
