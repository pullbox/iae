/*
Copyright (c) 2010 McDowell

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

package demo.fluentio;

import java.io.IOException;

/**
 * Doctors a stream in some way.
 * 
 * <p>
 * Implementations should document their mutability and thread-safety.
 * </p>
 * 
 * @author McDowell
 * 
 * @param <T>
 *          the type being produced
 * @param <F>
 *          the type being doctored
 */
public interface Doctor<T, F> {

  /**
   * Changes the input in some way (mutates it, adapts it, decorates it, etc.)
   * 
   * @param f
   *          the object being doctored
   * @return the doctored object
   * @throws IOException
   *           on I/O error
   */
  public T op(F f) throws IOException;
}
