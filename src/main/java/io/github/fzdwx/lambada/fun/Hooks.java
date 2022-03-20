package io.github.fzdwx.lambada.fun;

import java.io.IOException;

/**
 * hooks.
 *
 * @author <a href="mailto:likelovec@gmail.com">韦朕</a>
 * @date 2022/03/19 16:18:55
 * @since 0.06
 */
@FunctionalInterface
public interface Hooks<Element> {

    void call(Element e);
}