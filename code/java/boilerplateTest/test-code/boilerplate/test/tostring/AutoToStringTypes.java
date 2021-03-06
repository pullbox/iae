/*
Copyright (c) 2008 McDowell

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

package boilerplate.test.tostring;

import boilerplate.tostring.AutoToString;

@AutoToString
public class AutoToStringTypes {

    // objects
    public String mString = "MyString";
    public Object mObject = new Object();

    // arrays
    public String[] mArray = { "Arr1", "Arr2", };
    public Object[] mObjectArray = { "Foo", new Object[] { "Bar" },
            new int[] { 10000 }, new double[][] { { 9.0 } }, };
    public int[] mIntArray = { 0, 1, 2, 3, };
    public int[][] mDeepIntArray = { { 0, 1, 2, 3, }, { 4, 5, 6, 7, }, };
    public boolean[] mBooleanArray = { true };
    public char[] mCharArray = { 'a' };
    public byte[] mByteArray = { 1 };
    public short[] mShortArray = { 2 };
    public long[] mLongArray = { 4 };
    public float[] mFloatArray = { 5 };
    public double[] mDoubleArray = { 6 };

    // primitives
    public boolean mBoolean = false;
    public char mChar = '@';
    public byte mByte = 1;
    public short mShort = 2;
    public int mInt = 3;
    public long mLong = 4;
    public float mFloat = 5;
    public double mDouble = 6;

}
