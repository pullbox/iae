/*
Copyright (c) 2009 McDowell

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

package hurl.incidental;

/**
 * Iterator for iterating 32bit Unicode codepoints (not all codepoints can be
 * represented in a single Java char).
 * 
 * @author McDowell
 */
public final class CodepointIterator {
  private final CharSequence data;
  private int index = 0;

  public CodepointIterator(CharSequence data) {
    this.data = data;
  }

  public boolean hasNext() {
    return index < data.length();
  }

  public int next() {
    char ch = data.charAt(index++);
    if (Character.isHighSurrogate(ch)) {
      int ret = Character.toCodePoint(ch, data.charAt(index++));
      index += 2;
      return ret;
    } else {
      return ch;
    }
  }
}