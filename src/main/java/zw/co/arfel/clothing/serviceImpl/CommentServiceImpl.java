package zw.co.arfel.clothing.serviceImpl;


import org.springframework.stereotype.Service;
import zw.co.arfel.clothing.model.Comment;
import zw.co.arfel.clothing.repository.CommentRepository;
import zw.co.arfel.clothing.service.CommentService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentRepository commentRepository;
    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Optional<Comment> findOne(Long id) {
        return null;
    }

    @Override
    public Optional<List<Comment>> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Boolean checkDuplicate(Comment comment) {
        return null;
    }
}
