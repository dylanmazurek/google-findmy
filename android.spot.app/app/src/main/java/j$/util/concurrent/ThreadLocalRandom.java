package j$.util.concurrent;

import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;
    long a;
    int b;
    boolean c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
    private static final ThreadLocal d = new ThreadLocal();
    private static final AtomicInteger e = new AtomicInteger();
    private static final ThreadLocal f = new ThreadLocal();
    private static final AtomicLong g = new AtomicLong(e(System.currentTimeMillis()) ^ e(System.nanoTime()));

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.security.PrivilegedAction] */
    static {
        if (((Boolean) AccessController.doPrivileged((PrivilegedAction) new Object())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (seed[i] & 255);
            }
            g.set(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ThreadLocalRandom(int i) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f.get()).b = i4;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b() {
        return ((ThreadLocalRandom) f.get()).b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c() {
        int addAndGet = e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long e2 = e(g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        threadLocalRandom.a = e2;
        threadLocalRandom.b = addAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        if (threadLocalRandom.b == 0) {
            c();
        }
        return threadLocalRandom;
    }

    private static int d(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long e(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    final long f() {
        long j = this.a - 7046029254386353131L;
        this.a = j;
        return j;
    }

    @Override // java.util.Random
    protected final int next(int i) {
        return nextInt() >>> (32 - i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        if (d(f()) < 0) {
            return true;
        }
        return false;
    }

    public final double nextDouble(double d2, double d3) {
        if (d2 < d3) {
            double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
            if (d2 >= d3) {
                return nextLong;
            }
            double d4 = ((d3 - d2) * nextLong) + d2;
            return d4 >= d3 ? Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1) : d4;
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (d(f()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = d;
        Double d2 = (Double) threadLocal.get();
        if (d2 != null) {
            threadLocal.set(null);
            return d2.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d3 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d3 < 1.0d && d3 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d3) * (-2.0d)) / d3);
                threadLocal.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    public final int nextInt(int i, int i2) {
        int i3;
        if (i < i2) {
            int d2 = d(f());
            if (i >= i2) {
                return d2;
            }
            int i4 = i2 - i;
            int i5 = i4 - 1;
            if ((i4 & i5) == 0) {
                i3 = d2 & i5;
            } else if (i4 > 0) {
                int i6 = d2 >>> 1;
                while (true) {
                    int i7 = i6 + i5;
                    i3 = i6 % i4;
                    if (i7 - i3 >= 0) {
                        break;
                    }
                    i6 = d(f()) >>> 1;
                }
            } else {
                while (true) {
                    if (d2 >= i && d2 < i2) {
                        return d2;
                    }
                    d2 = d(f());
                }
            }
            return i3 + i;
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public long nextLong(long j, long j2) {
        if (j < j2) {
            long e2 = e(f());
            if (j >= j2) {
                return e2;
            }
            long j3 = j2 - j;
            long j4 = j3 - 1;
            if ((j3 & j4) == 0) {
                return (e2 & j4) + j;
            }
            if (j3 > 0) {
                long j5 = e2 >>> 1;
                while (true) {
                    long j6 = j5 + j4;
                    long j7 = j5 % j3;
                    if (j6 - j7 >= 0) {
                        return j7 + j;
                    }
                    j5 = e(f()) >>> 1;
                }
            } else {
                while (true) {
                    if (e2 >= j && e2 < j2) {
                        return e2;
                    }
                    e2 = e(f());
                }
            }
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (!this.c) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private ThreadLocalRandom() {
        this.c = true;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (e(f()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d2) {
        if (d2 > 0.0d) {
            double e2 = (e(f()) >>> 11) * 1.1102230246251565E-16d * d2;
            return e2 < d2 ? e2 : Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1);
        }
        throw new IllegalArgumentException("bound must be positive");
    }

    @Override // java.util.Random
    public final int nextInt() {
        return d(f());
    }

    @Override // java.util.Random
    public final long nextLong() {
        return e(f());
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i > 0) {
            int d2 = d(f());
            int i2 = i - 1;
            if ((i & i2) == 0) {
                return d2 & i2;
            }
            while (true) {
                int i3 = d2 >>> 1;
                int i4 = i3 + i2;
                int i5 = i3 % i;
                if (i4 - i5 >= 0) {
                    return i5;
                }
                d2 = d(f());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    public final long nextLong(long j) {
        if (j > 0) {
            long e2 = e(f());
            long j2 = j - 1;
            if ((j & j2) == 0) {
                return e2 & j2;
            }
            while (true) {
                long j3 = e2 >>> 1;
                long j4 = j3 + j2;
                long j5 = j3 % j;
                if (j4 - j5 >= 0) {
                    return j5;
                }
                e2 = e(f());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }
}
