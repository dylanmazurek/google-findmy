package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgg {
    private final Map a = new LinkedHashMap(16, 0.75f, true);
    private long b = 0;
    private final njz c;

    public dgg(File file) {
        this.c = new njz(file, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(InputStream inputStream) {
        return (m(inputStream) << 24) | m(inputStream) | (m(inputStream) << 8) | (m(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(InputStream inputStream) {
        return (m(inputStream) & 255) | ((m(inputStream) & 255) << 8) | ((m(inputStream) & 255) << 16) | ((m(inputStream) & 255) << 24) | ((m(inputStream) & 255) << 32) | ((m(inputStream) & 255) << 40) | ((m(inputStream) & 255) << 48) | ((m(inputStream) & 255) << 56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(dgf dgfVar) {
        return new String(l(dgfVar, b(dgfVar)), "UTF-8");
    }

    static void i(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void j(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void k(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        j(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] l(dgf dgfVar, long j) {
        long a = dgfVar.a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(dgfVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + a);
    }

    private static int m(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void n(String str, dge dgeVar) {
        if (!this.a.containsKey(str)) {
            this.b += dgeVar.a;
        } else {
            this.b += dgeVar.a - ((dge) this.a.get(str)).a;
        }
        this.a.put(str, dgeVar);
    }

    private final void o(String str) {
        dge dgeVar = (dge) this.a.remove(str);
        if (dgeVar != null) {
            this.b -= dgeVar.a;
        }
    }

    private static final String p(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final synchronized dfh c(String str) {
        dge dgeVar = (dge) this.a.get(str);
        if (dgeVar == null) {
            return null;
        }
        File d = d(str);
        try {
            dgf dgfVar = new dgf(new BufferedInputStream(new FileInputStream(d)), d.length());
            try {
                dge a = dge.a(dgfVar);
                if (!TextUtils.equals(str, a.b)) {
                    dga.a("%s: key=%s, found=%s", d.getAbsolutePath(), str, a.b);
                    o(str);
                    return null;
                }
                byte[] l = l(dgfVar, dgfVar.a());
                dfh dfhVar = new dfh();
                dfhVar.a = l;
                dfhVar.b = dgeVar.c;
                dfhVar.c = dgeVar.d;
                dfhVar.d = dgeVar.e;
                dfhVar.e = dgeVar.f;
                dfhVar.f = dgeVar.g;
                List<dfl> list = dgeVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (dfl dflVar : list) {
                    treeMap.put(dflVar.a, dflVar.b);
                }
                dfhVar.g = treeMap;
                dfhVar.h = DesugarCollections.unmodifiableList(dgeVar.h);
                return dfhVar;
            } finally {
                dgfVar.close();
            }
        } catch (IOException e) {
            dga.a("%s: %s", d.getAbsolutePath(), e.toString());
            h(str);
            return null;
        }
    }

    public final File d(String str) {
        return new File((File) this.c.a, p(str));
    }

    public final synchronized void f() {
        long length;
        dgf dgfVar;
        Object obj = this.c.a;
        if (!((File) obj).exists()) {
            if (!((File) obj).mkdirs()) {
                dga.b("Unable to create cache dir %s", ((File) obj).getAbsolutePath());
            }
        } else {
            File[] listFiles = ((File) obj).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        dgfVar = new dgf(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        dge a = dge.a(dgfVar);
                        a.a = length;
                        n(a.b, a);
                        dgfVar.close();
                    } catch (Throwable th) {
                        dgfVar.close();
                        throw th;
                        break;
                    }
                }
            }
        }
    }

    public final synchronized void g(String str, dfh dfhVar) {
        List list;
        long j;
        long j2 = this.b;
        int length = dfhVar.a.length;
        if (j2 + length <= 10485760 || length <= 9437184.0f) {
            File d = d(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d));
                String str2 = dfhVar.b;
                long j3 = dfhVar.c;
                long j4 = dfhVar.d;
                long j5 = dfhVar.e;
                long j6 = dfhVar.f;
                List list2 = dfhVar.h;
                if (list2 == null) {
                    Map map = dfhVar.g;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
                        Map.Entry entry = (Map.Entry) it.next();
                        arrayList.add(new dfl((String) entry.getKey(), (String) entry.getValue()));
                    }
                    list = arrayList;
                    j = j4;
                } else {
                    list = list2;
                    j = j4;
                }
                dge dgeVar = new dge(str, str2, j3, j, j5, j6, list);
                try {
                    i(bufferedOutputStream, 538247942);
                    k(bufferedOutputStream, dgeVar.b);
                    String str3 = dgeVar.c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    k(bufferedOutputStream, str3);
                    j(bufferedOutputStream, dgeVar.d);
                    j(bufferedOutputStream, dgeVar.e);
                    j(bufferedOutputStream, dgeVar.f);
                    j(bufferedOutputStream, dgeVar.g);
                    List<dfl> list3 = dgeVar.h;
                    if (list3 != null) {
                        i(bufferedOutputStream, list3.size());
                        for (dfl dflVar : list3) {
                            k(bufferedOutputStream, dflVar.a);
                            k(bufferedOutputStream, dflVar.b);
                        }
                    } else {
                        i(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(dfhVar.a);
                    bufferedOutputStream.close();
                    dgeVar.a = d.length();
                    n(str, dgeVar);
                    if (this.b >= 10485760) {
                        String str4 = dga.a;
                        SystemClock.elapsedRealtime();
                        Iterator it2 = this.a.entrySet().iterator();
                        while (it2.hasNext()) {
                            dge dgeVar2 = (dge) ((Map.Entry) it2.next()).getValue();
                            if (d(dgeVar2.b).delete()) {
                                this.b -= dgeVar2.a;
                            } else {
                                String str5 = dgeVar2.b;
                                dga.a("Could not delete cache entry for key=%s, filename=%s", str5, p(str5));
                            }
                            it2.remove();
                            if (((float) this.b) < 9437184.0f) {
                                break;
                            }
                        }
                    }
                } catch (IOException e) {
                    dga.a("%s", e.toString());
                    bufferedOutputStream.close();
                    dga.a("Failed to write header for %s", d.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!d.delete()) {
                    dga.a("Could not clean up file %s", d.getAbsolutePath());
                }
                if (!((File) this.c.a).exists()) {
                    dga.a("Re-initializing cache after external clearing.", new Object[0]);
                    this.a.clear();
                    this.b = 0L;
                    f();
                }
            }
        }
    }

    public final synchronized void h(String str) {
        boolean delete = d(str).delete();
        o(str);
        if (!delete) {
            dga.a("Could not delete cache entry for key=%s, filename=%s", str, p(str));
        }
    }
}
