package defpackage;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nnw implements Serializable {
    public static final nnw a = new nrk("UTC", "UTC", 0, 0);
    public static Set b = null;
    public static nrj d = null;
    private static nrl e = null;
    private static volatile nnw f = null;
    private static nqe g = null;
    private static Map h = null;
    private static Map i = null;
    private static final long serialVersionUID = 5546345482340108586L;
    public final String c;

    /* JADX WARN: Removed duplicated region for block: B:40:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    static {
        /*
            nrk r0 = new nrk
            r1 = 0
            java.lang.String r2 = "UTC"
            r0.<init>(r2, r2, r1, r1)
            defpackage.nnw.a = r0
            r0 = 0
            java.lang.String r1 = "org.joda.time.DateTimeZone.Provider"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L2b
            if (r1 == 0) goto L2c
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L2b
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L2b
            nrl r1 = (defpackage.nrl) r1     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L2b
            goto L2d
        L1e:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L2b
            java.lang.ThreadGroup r4 = r3.getThreadGroup()     // Catch: java.lang.SecurityException -> L2b
            r4.uncaughtException(r3, r1)     // Catch: java.lang.SecurityException -> L2b
            goto L2c
        L2b:
        L2c:
            r1 = r0
        L2d:
            if (r1 != 0) goto L42
            nro r3 = new nro     // Catch: java.lang.Exception -> L36
            r3.<init>(r0)     // Catch: java.lang.Exception -> L36
            r1 = r3
            goto L42
        L36:
            r3 = move-exception
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r5 = r4.getThreadGroup()
            r5.uncaughtException(r4, r3)
        L42:
            if (r1 != 0) goto L49
            nrm r1 = new nrm
            r1.<init>()
        L49:
            java.util.Set r3 = r1.a()
            if (r3 == 0) goto La7
            int r4 = r3.size()
            if (r4 == 0) goto La7
            boolean r4 = r3.contains(r2)
            if (r4 == 0) goto L9f
            nnw r2 = r1.b(r2)
            nnw r4 = defpackage.nnw.a
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L97
            defpackage.nnw.e = r1
            defpackage.nnw.b = r3
            java.lang.String r1 = "org.joda.time.DateTimeZone.NameProvider"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L8c
            if (r1 == 0) goto L8d
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L7f java.lang.SecurityException -> L8c
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L7f java.lang.SecurityException -> L8c
            nrj r1 = (defpackage.nrj) r1     // Catch: java.lang.Exception -> L7f java.lang.SecurityException -> L8c
            r0 = r1
            goto L8d
        L7f:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L8c
            java.lang.ThreadGroup r3 = r2.getThreadGroup()     // Catch: java.lang.SecurityException -> L8c
            r3.uncaughtException(r2, r1)     // Catch: java.lang.SecurityException -> L8c
            goto L8d
        L8c:
        L8d:
            if (r0 != 0) goto L94
            nrj r0 = new nrj
            r0.<init>()
        L94:
            defpackage.nnw.d = r0
            return
        L97:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid UTC zone provided"
            r0.<init>(r1)
            throw r0
        L9f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provider doesn't support UTC"
            r0.<init>(r1)
            throw r0
        La7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provider doesn't have any available ids"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnw.<clinit>():void");
    }

    public nnw(String str) {
        this.c = str;
    }

    public static String h(int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i2 = -i2;
        }
        int i3 = i2 / 3600000;
        nqy.c(stringBuffer, i3, 2);
        stringBuffer.append(':');
        int i4 = i2 - (i3 * 3600000);
        int i5 = i4 / 60000;
        nqy.c(stringBuffer, i5, 2);
        int i6 = i4 - (i5 * 60000);
        if (i6 != 0) {
            int i7 = i6 / 1000;
            stringBuffer.append(':');
            nqy.c(stringBuffer, i7, 2);
            int i8 = i6 - (i7 * 1000);
            if (i8 != 0) {
                stringBuffer.append('.');
                nqy.c(stringBuffer, i8, 3);
                return stringBuffer.toString();
            }
        }
        return stringBuffer.toString();
    }

    public static nnw i(String str) {
        if (str == null) {
            return j();
        }
        if (!str.equals("UTC")) {
            nnw b2 = e.b(str);
            if (b2 != null) {
                return b2;
            }
            if (!str.startsWith("+") && !str.startsWith("-")) {
                throw new IllegalArgumentException(a.ag(str, "The datetime zone id '", "' is not recognised"));
            }
            int n = n(str);
            if (n != 0) {
                return p(h(n), n);
            }
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0095 A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #1 {, blocks: (B:6:0x0007, B:10:0x000c, B:12:0x0014, B:19:0x0020, B:21:0x0026, B:16:0x0095, B:17:0x0097, B:22:0x002b, B:24:0x0037, B:25:0x003a, B:27:0x0040, B:29:0x0048, B:33:0x0053, B:35:0x005f, B:37:0x0067, B:39:0x0077, B:40:0x007a, B:41:0x0083, B:42:0x0090, B:49:0x0099), top: B:5:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.nnw j() {
        /*
            nnw r0 = defpackage.nnw.f
            if (r0 != 0) goto L9e
            java.lang.Class<nnw> r1 = defpackage.nnw.class
            monitor-enter(r1)
            nnw r0 = defpackage.nnw.f     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L99
            r0 = 0
            java.lang.String r2 = "user.timezone"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.RuntimeException -> L1c java.lang.Throwable -> L9b
            if (r2 == 0) goto L1d
            nnw r2 = i(r2)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.RuntimeException -> L1c java.lang.Throwable -> L9b
            goto L1e
        L19:
            goto L93
        L1c:
        L1d:
            r2 = r0
        L1e:
            if (r2 != 0) goto L92
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            if (r3 != 0) goto L2b
            nnw r0 = j()     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            goto L93
        L2b:
            java.lang.String r4 = r3.getID()     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            java.lang.String r5 = "UTC"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            if (r5 == 0) goto L3a
            nnw r0 = defpackage.nnw.a     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            goto L93
        L3a:
            java.lang.String r5 = o(r4)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            if (r5 == 0) goto L46
            nrl r0 = defpackage.nnw.e     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            nnw r0 = r0.b(r5)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
        L46:
            if (r0 != 0) goto L4e
            nrl r0 = defpackage.nnw.e     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            nnw r0 = r0.b(r4)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
        L4e:
            if (r0 == 0) goto L51
            goto L93
        L51:
            if (r5 != 0) goto L83
            java.lang.String r0 = r3.getID()     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            java.lang.String r3 = "GMT+"
            boolean r3 = r0.startsWith(r3)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            if (r3 != 0) goto L67
            java.lang.String r3 = "GMT-"
            boolean r3 = r0.startsWith(r3)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            if (r3 == 0) goto L83
        L67:
            r3 = 3
            java.lang.String r0 = r0.substring(r3)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            int r0 = n(r0)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            long r3 = (long) r0     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L7a
            nnw r0 = defpackage.nnw.a     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            goto L93
        L7a:
            java.lang.String r3 = h(r0)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            nnw r0 = p(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            goto L93
        L83:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            java.lang.String r3 = "The datetime zone id '"
            java.lang.String r5 = "' is not recognised"
            java.lang.String r3 = defpackage.a.ag(r4, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
            throw r0     // Catch: java.lang.IllegalArgumentException -> L91 java.lang.Throwable -> L9b
        L91:
        L92:
            r0 = r2
        L93:
            if (r0 != 0) goto L97
            nnw r0 = defpackage.nnw.a     // Catch: java.lang.Throwable -> L9b
        L97:
            defpackage.nnw.f = r0     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9b
            goto L9e
        L9b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9b
            throw r0
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnw.j():nnw");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nra] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, nrc] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, nra] */
    private static int n(String str) {
        String concat;
        String str2;
        nnu nnuVar = new nnu();
        nqe q = q();
        if (q.c != nnuVar) {
            q = new nqe((nrc) q.a, (nra) q.b, nnuVar, (nnw) q.d);
        }
        ?? r0 = q.b;
        if (r0 != 0) {
            nqw nqwVar = new nqw(q.b((nno) q.c));
            int c = r0.c(nqwVar, str, 0);
            if (c >= 0) {
                if (c >= str.length()) {
                    return -((int) nqwVar.g(str));
                }
            } else {
                c = ~c;
            }
            String charSequence = str.toString();
            int i2 = nqy.a;
            int i3 = c + 32;
            if (charSequence.length() <= c + 35) {
                concat = charSequence;
            } else {
                concat = charSequence.substring(0, i3).concat("...");
            }
            if (c > 0) {
                if (c >= charSequence.length()) {
                    str2 = "Invalid format: \"" + concat + "\" is too short";
                } else {
                    str2 = "Invalid format: \"" + concat + "\" is malformed at \"" + concat.substring(c) + "\"";
                }
            } else {
                str2 = "Invalid format: \"" + concat + "\"";
            }
            throw new IllegalArgumentException(str2);
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    private static synchronized String o(String str) {
        String str2;
        synchronized (nnw.class) {
            Map map = i;
            if (map == null) {
                map = new HashMap();
                map.put("GMT", "UTC");
                map.put("WET", "WET");
                map.put("CET", "CET");
                map.put("MET", "CET");
                map.put("ECT", "CET");
                map.put("EET", "EET");
                map.put("MIT", "Pacific/Apia");
                map.put("HST", "Pacific/Honolulu");
                map.put("AST", "America/Anchorage");
                map.put("PST", "America/Los_Angeles");
                map.put("MST", "America/Denver");
                map.put("PNT", "America/Phoenix");
                map.put("CST", "America/Chicago");
                map.put("EST", "America/New_York");
                map.put("IET", "America/Indiana/Indianapolis");
                map.put("PRT", "America/Puerto_Rico");
                map.put("CNT", "America/St_Johns");
                map.put("AGT", "America/Argentina/Buenos_Aires");
                map.put("BET", "America/Sao_Paulo");
                map.put("ART", "Africa/Cairo");
                map.put("CAT", "Africa/Harare");
                map.put("EAT", "Africa/Addis_Ababa");
                map.put("NET", "Asia/Yerevan");
                map.put("PLT", "Asia/Karachi");
                map.put("IST", "Asia/Kolkata");
                map.put("BST", "Asia/Dhaka");
                map.put("VST", "Asia/Ho_Chi_Minh");
                map.put("CTT", "Asia/Shanghai");
                map.put("JST", "Asia/Tokyo");
                map.put("ACT", "Australia/Darwin");
                map.put("AET", "Australia/Sydney");
                map.put("SST", "Pacific/Guadalcanal");
                map.put("NST", "Pacific/Auckland");
                i = map;
            }
            str2 = (String) map.get(str);
        }
        return str2;
    }

    private static synchronized nnw p(String str, int i2) {
        nnw nnwVar;
        synchronized (nnw.class) {
            if (i2 == 0) {
                return a;
            }
            if (h == null) {
                h = new HashMap();
            }
            Reference reference = (Reference) h.get(str);
            if (reference != null && (nnwVar = (nnw) reference.get()) != null) {
                return nnwVar;
            }
            nrk nrkVar = new nrk(str, null, i2, i2);
            h.put(str, new SoftReference(nrkVar));
            return nrkVar;
        }
    }

    private static synchronized nqe q() {
        nqe nqeVar;
        synchronized (nnw.class) {
            if (g == null) {
                nqt nqtVar = new nqt();
                nqtVar.u(null, true, 4);
                g = nqtVar.a();
            }
            nqeVar = g;
        }
        return nqeVar;
    }

    public abstract int a(long j);

    public int b(long j) {
        int a2 = a(j);
        long j2 = j - a2;
        int a3 = a(j2);
        if (a2 != a3) {
            if (a2 - a3 < 0 && e(j2) != e(j - a3)) {
                return a2;
            }
        } else if (a2 >= 0) {
            long f2 = f(j2);
            if (f2 < j2) {
                int a4 = a(f2);
                if (j2 - f2 <= a4 - a2) {
                    return a4;
                }
            }
        }
        return a3;
    }

    public abstract int c(long j);

    public final long d(long j) {
        long a2 = a(j);
        long j2 = j + a2;
        if ((j ^ j2) < 0 && (j ^ a2) >= 0) {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        return j2;
    }

    public abstract long e(long j);

    public abstract boolean equals(Object obj);

    public abstract long f(long j);

    public abstract String g(long j);

    public int hashCode() {
        return this.c.hashCode() + 57;
    }

    public abstract boolean k();

    public final boolean l(long j) {
        if (a(j) == c(j)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:            if (r2 != r4) goto L70;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m(long r10, long r12) {
        /*
            r9 = this;
            int r12 = r9.a(r12)
            long r0 = (long) r12
            long r0 = r10 - r0
            int r13 = r9.a(r0)
            if (r13 == r12) goto L56
            int r12 = r9.a(r10)
            long r0 = (long) r12
            long r0 = r10 - r0
            int r13 = r9.a(r0)
            if (r12 == r13) goto L3c
            if (r12 >= 0) goto L3c
            long r2 = r9.e(r0)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L2a
            r2 = r4
        L2a:
            long r0 = (long) r13
            long r0 = r10 - r0
            long r6 = r9.e(r0)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L36
            goto L37
        L36:
            r4 = r6
        L37:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L3c
            goto L3d
        L3c:
            r12 = r13
        L3d:
            long r12 = (long) r12
            long r0 = r10 - r12
            long r2 = r10 ^ r0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L56
            long r10 = r10 ^ r12
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 < 0) goto L4e
            goto L56
        L4e:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "Subtracting time zone offset caused overflow"
            r10.<init>(r11)
            throw r10
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnw.m(long, long):long");
    }

    public final String toString() {
        return this.c;
    }

    protected Object writeReplace() {
        return new nnv(this.c);
    }
}
