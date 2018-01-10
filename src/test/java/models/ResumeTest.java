package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResumeTest {

    @Test
    public void NewPostObjectGetsCorrectlyCreated_true() throws Exception {
        Resume resume = new Resume("Job 1: Epicodus", "title", "name", "location", "EmploymentDate");
        assertEquals(true, resume instanceof Resume);
    }

    @Test
    public void ResumeInstantiatesWithContent_true() throws Exception {
        Resume resume = new Resume("Job 1: Epicodus", "title", "name", "location", "EmploymentDate");
        assertEquals("Job 1: Epicodus", resume.getContent());

    }

    @Test
    public void ResumeInstantiatesWithTitle_true() throws Exception {
        Resume resume = new Resume("Job 1: Epicodus", "title", "name", "location", "EmploymentDate");
        assertEquals("title", resume.getTitle());

    }

    @Test
    public void ResumeInstantiatesWithName_true() throws Exception {
        Resume resume = new Resume("Job 1: Epicodus", "title", "name", "location", "EmploymentDate");
        assertEquals("name", resume.getName());

    }

    @Test
    public void ResumeInstantiatesWithLocation_true() throws Exception {
        Resume resume = new Resume("Job 1: Epicodus", "title", "name", "location", "EmploymentDate");
        assertEquals("location", resume.getLocation());

    }

    @Test
    public void ResumeInstantiatesWithEmploymentDate_true() throws Exception {
        Resume resume = new Resume("Job 1: Epicodus", "title", "name", "location", "EmploymentDate");
        assertEquals("EmploymentDate", resume.getEmploymentDate());

    }

    @After
    public void tearDown() {
        Resume.clearAllPosts(); //clear out allll the posts before each test.
    }

    @Test
    public void AllPostsAreCorrectlyReturned_true() {
        Resume resume = new Resume("Job 1: Epicodus", "title", "name", "location", "EmploymentDate");
        Resume otherResume = new Resume ("Operated and handled machines", "Machine Operator", "AmFor Electronics", "Swan Island, Portland OR", "12-7-1996, 12-8-1996");
        assertEquals(2, Resume.getAll().size());
    }

    @Test
    public void AllPostsContainsAllPosts_true() {
        Resume resume = new Resume("Job 1: Epicodus", "title", "name", "location", "EmploymentDate");
        Resume otherResume = new Resume ("Operated and handled machines", "Machine Operator", "AmFor Electronics", "Swan Island, Portland OR", "12-7-1996, 12-8-1996");
        assertTrue(Resume.getAll().contains(resume));
        assertTrue(Resume.getAll().contains(otherResume));
    }
}