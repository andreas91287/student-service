package ait.cohort46.students.service;

import ait.cohort46.student.dao.StudentRepository;
import ait.cohort46.student.dto.*;
import ait.cohort46.student.model.Student;
import ait.cohort46.student.service.StudentService;
import ait.cohort46.student.service.StudentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StudentServiceMockitoTest {
    @Mock
    private StudentRepository studentRepository;
    private ModelMapper modelMapper;
    private StudentService studentService;

    @BeforeEach
    void setUp() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STRICT);
        studentService = new StudentServiceImpl(studentRepository, modelMapper);
    }
//
//    @Test
//    void testAddStudentWhenStudentExists() {
//        // Arrange
//        StudentAddDto dto = new StudentAddDto(1L, "John", "password");
//        when(studentRepository.existsById(gto.getId())).thenReturn(true);
//
//        // Act
//        Boolean result = studentService.addStudent(dto);
//
//        // Assert
//        assertFalse(result);
//        verify(studentRepository, never()).save(any(Student.class));
//    }
//
//    @Test
//    void testAddStudentWhenStudentNotExists() {
//        // Arrange
//        StudentAddDto dto = new StudentAddDto(1L, "John", "password");
//        when(studentRepository.existsById(gto.getId())).thenReturn(false);
//
//        // Act
//        Boolean result = studentService.addStudent(dto);
//
//        // Assert
//        assertFalse(result);
//        verify(studentRepository, times(1)).save(any(Student.class));
//    }
//
//    @Test
//    void testFindStudentWhenStudentExists() {
//        // Arrange
//        Student student = new Student(1L, "John", "password");
//        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
//
//        // Act & Assert
//        StudentDto result = studentService.findStudent(1L);
//
//        // Assert
//        assertNotNull(result);
//        assertEquals("John", result.getName());
//    }
//
//    @Test
//    void testFindStudentWhenStudentNotExists() {
//        // Arrange
//        when(studentRepository.findById(1L)).thenReturn(Optional.empty());
//
//        // Act & Assert
//        assertThrows(StudentNotFoundException.class, () -> studentService.findStudent(1L));
//    }
//
//    @Test
//    void testRemoveStudent() {
//        // Arrange
//        Student student = new Student(1L, "John", "password");
//        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
//
//        // Act & Assert
//        StudentDto result = studentService.findStudent(1L);
//
//        // Assert
//        assertNotNull(result);
//        verify(studentRepository, times(1)).deleteById(1L);
//    }
//
//    @Test
//    void testUpdateStudent() {
//        // Arrange
//        Student student = new Student(1L, "John", "password");
//        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
//        StudentUpdateDto updateDto = new StudentUpdateDto("NewName", null);
//
//        // Act & Assert
//        StudentAddDto result = studentService.updateStudent(1L, updateDto);
//
//        // Assert
//        assertNotNull(result);
//        assertEquals("NewName", result.getName());
//        assertEquals("password", result.getPassword());
//        verify(studentRepository, times(1)).save(any(Student.class));
//    }
//
//    @Test
//    void testAddScore() {
//        // Arrange
//        Student student = new Student(1L, "John", "password");
//        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
//        ScoreDto scoreDto = new ScoreDto("Math", 90);
//
//        // Act & Assert
//        Boolean result = studentService.addScore(1L, scoreDto);
//
//        // Assert
//        assertTrue(result);
//        verify(studentRepository, times(1)).save(any(Student.class));
//    }
//
//    @Test
//    void testFindStudentsByName() {
//        // Arrange
//        Student student = new Student(1L, "John", "password");
//        when(studentRepository.findByNameIgnoreCase("John")).thenReturn(Stream.of(student));
//
//        // Act & Assert
//        List<StudentDto> result = studentService.findStudentsByName("John");
//
//        // Assert
//        assertNotNull(result);
//        assertEquals(1, result.size());
//        assertEquals("John", result.get(0).getName());
//    }
//
//    @Test
//    void testGetStudentsQuantityByNames() {
//        // Arrange
//        Set<String> names = Set.of("John", "Peter");
//        when(studentRepository.countByNameIgnoreCase(names)).thenReturn(2L);
//
//        // Act & Assert
//        Long result = studentService.getStudentsQuantityByNames(names);
//
//        // Assert
//        assertEquals(2L, result);
//    }
//
//    @Test
//    void testFindStudentsByExamMinScore() {
//        // Arrange
//        Student student = new Student(1L, "John", "password");
//        when(studentRepository.findByExamAndScoreGreaterThan("Math", 90)).thenReturn(Stream.of(student));
//
//        // Act & Assert
//        List<StudentDto> result = studentService.findStudentsByExamMinScore("Math", 90);
//
//        // Assert
//        assertNotNull(result);
//        assertEquals(1, result.size());
//        assertEquals("John", result.get(0).getName());
//    }

}
