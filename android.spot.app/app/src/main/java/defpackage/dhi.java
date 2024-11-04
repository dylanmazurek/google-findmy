package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhi implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer f;
    public int h;
    private final File j;
    public long e = 0;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dhf());
    private final Callable n = new fcz(this, 1);
    private final int k = 1;
    public final int d = 1;
    private final long l = 262144000;

    public dhi(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
    }

    public static void b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void e(File file, File file2, boolean z) {
        if (z) {
            b(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    private final void k() {
        if (this.f != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void l(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void m(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized void a(dhg dhgVar, boolean z) {
        dhh dhhVar = dhgVar.a;
        if (dhhVar.f == dhgVar) {
            if (z && !dhhVar.e) {
                for (int i = 0; i < this.d; i = 1) {
                    if (dhgVar.b[0]) {
                        if (!dhhVar.d().exists()) {
                            dhgVar.a();
                            return;
                        }
                    } else {
                        dhgVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index 0");
                    }
                }
            }
            for (int i2 = 0; i2 < this.d; i2 = 1) {
                File d = dhhVar.d();
                if (z) {
                    if (d.exists()) {
                        File c = dhhVar.c();
                        d.renameTo(c);
                        long j = dhhVar.b[0];
                        long length = c.length();
                        dhhVar.b[0] = length;
                        this.e = (this.e - j) + length;
                    }
                } else {
                    b(d);
                }
            }
            this.h++;
            dhhVar.f = null;
            if (dhhVar.e | z) {
                dhhVar.e = true;
                this.f.append((CharSequence) "CLEAN");
                this.f.append(' ');
                this.f.append((CharSequence) dhhVar.a);
                this.f.append((CharSequence) dhhVar.a());
                this.f.append('\n');
                if (z) {
                    this.m++;
                }
            } else {
                this.g.remove(dhhVar.a);
                this.f.append((CharSequence) "REMOVE");
                this.f.append(' ');
                this.f.append((CharSequence) dhhVar.a);
                this.f.append('\n');
            }
            m(this.f);
            if (this.e <= this.l && !g()) {
                return;
            }
            this.i.submit(this.n);
            return;
        }
        throw new IllegalStateException();
    }

    public final void c() {
        String a;
        String substring;
        dhk dhkVar = new dhk(new FileInputStream(this.b), dhl.a);
        try {
            String a2 = dhkVar.a();
            String a3 = dhkVar.a();
            String a4 = dhkVar.a();
            String a5 = dhkVar.a();
            String a6 = dhkVar.a();
            if ("libcore.io.DiskLruCache".equals(a2) && "1".equals(a3) && Integer.toString(this.k).equals(a4) && Integer.toString(this.d).equals(a5) && "".equals(a6)) {
                int i = 0;
                while (true) {
                    try {
                        a = dhkVar.a();
                        int indexOf = a.indexOf(32);
                        if (indexOf != -1) {
                            int i2 = indexOf + 1;
                            int indexOf2 = a.indexOf(32, i2);
                            if (indexOf2 == -1) {
                                substring = a.substring(i2);
                                if (indexOf == 6) {
                                    if (a.startsWith("REMOVE")) {
                                        this.g.remove(substring);
                                        i++;
                                    } else {
                                        indexOf = 6;
                                    }
                                }
                            } else {
                                substring = a.substring(i2, indexOf2);
                            }
                            dhh dhhVar = (dhh) this.g.get(substring);
                            if (dhhVar == null) {
                                dhhVar = new dhh(this, substring);
                                this.g.put(substring, dhhVar);
                            }
                            if (indexOf2 != -1 && indexOf == 5) {
                                if (a.startsWith("CLEAN")) {
                                    String[] split = a.substring(indexOf2 + 1).split(" ");
                                    dhhVar.e = true;
                                    dhhVar.f = null;
                                    if (split.length == dhhVar.g.d) {
                                        for (int i3 = 0; i3 < split.length; i3++) {
                                            try {
                                                dhhVar.b[i3] = Long.parseLong(split[i3]);
                                            } catch (NumberFormatException unused) {
                                                throw dhh.e(split);
                                            }
                                        }
                                        i++;
                                    } else {
                                        throw dhh.e(split);
                                    }
                                } else {
                                    indexOf = 5;
                                }
                            }
                            if (indexOf2 == -1 && indexOf == 5 && a.startsWith("DIRTY")) {
                                dhhVar.f = new dhg(this, dhhVar);
                            } else if (indexOf2 != -1 || indexOf != 4 || !a.startsWith("READ")) {
                                break;
                            }
                            i++;
                        } else {
                            throw new IOException("unexpected journal line: ".concat(String.valueOf(a)));
                        }
                    } catch (EOFException unused2) {
                        this.h = i - this.g.size();
                        if (dhkVar.b == -1) {
                            d();
                        } else {
                            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), dhl.a));
                        }
                        a.z(dhkVar);
                        return;
                    }
                }
                throw new IOException("unexpected journal line: ".concat(String.valueOf(a)));
            }
            throw new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + "]");
        } catch (Throwable th) {
            a.z(dhkVar);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dhg dhgVar = ((dhh) arrayList.get(i)).f;
            if (dhgVar != null) {
                dhgVar.a();
            }
        }
        f();
        l(this.f);
        this.f = null;
    }

    public final synchronized void d() {
        Writer writer = this.f;
        if (writer != null) {
            l(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), dhl.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (dhh dhhVar : this.g.values()) {
                if (dhhVar.f != null) {
                    bufferedWriter.write(a.ag(dhhVar.a, "DIRTY ", "\n"));
                } else {
                    bufferedWriter.write("CLEAN " + dhhVar.a + dhhVar.a() + "\n");
                }
            }
            l(bufferedWriter);
            if (this.b.exists()) {
                e(this.b, this.j, true);
            }
            e(this.c, this.b, false);
            this.j.delete();
            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), dhl.a));
        } catch (Throwable th) {
            l(bufferedWriter);
            throw th;
        }
    }

    public final void f() {
        while (this.e > this.l) {
            i((String) ((Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean g() {
        int i = this.h;
        if (i >= 2000 && i >= this.g.size()) {
            return true;
        }
        return false;
    }

    public final synchronized dhg h(String str) {
        k();
        dhh dhhVar = (dhh) this.g.get(str);
        if (dhhVar == null) {
            dhhVar = new dhh(this, str);
            this.g.put(str, dhhVar);
        } else if (dhhVar.f != null) {
            return null;
        }
        dhg dhgVar = new dhg(this, dhhVar);
        dhhVar.f = dhgVar;
        this.f.append((CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        m(this.f);
        return dhgVar;
    }

    public final synchronized void i(String str) {
        k();
        dhh dhhVar = (dhh) this.g.get(str);
        if (dhhVar != null && dhhVar.f == null) {
            for (int i = 0; i < this.d; i = 1) {
                File c = dhhVar.c();
                if (c.exists() && !c.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(c))));
                }
                long j = this.e;
                long[] jArr = dhhVar.b;
                this.e = j - jArr[0];
                jArr[0] = 0;
            }
            this.h++;
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            this.g.remove(str);
            if (g()) {
                this.i.submit(this.n);
            }
        }
    }

    public final synchronized dhx j(String str) {
        k();
        dhh dhhVar = (dhh) this.g.get(str);
        if (dhhVar != null && dhhVar.e) {
            File[] fileArr = dhhVar.c;
            int length = fileArr.length;
            for (int i = 0; i < length; i = 1) {
                if (fileArr[0].exists()) {
                }
            }
            this.h++;
            this.f.append((CharSequence) "READ");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            if (g()) {
                this.i.submit(this.n);
            }
            return new dhx(dhhVar.c);
        }
        return null;
    }
}
