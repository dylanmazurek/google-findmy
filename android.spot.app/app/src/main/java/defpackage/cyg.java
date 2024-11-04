package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyg {
    public static final Map a = new HashMap();
    private static final Set b = new HashSet();
    private static final byte[] c = {80, 75, 3, 4};

    public static cyr a(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return b(context.getAssets().open(str), str2);
            }
            return d(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new cyr((Throwable) e);
        }
    }

    public static cyr b(InputStream inputStream, String str) {
        try {
            nlf nlfVar = new nlf(nkz.b(inputStream));
            String[] strArr = dep.a;
            return k(new deq(nlfVar), str, true);
        } finally {
            dfb.e(inputStream);
        }
    }

    public static cyr c(Context context, int i, String str) {
        try {
            nlf nlfVar = new nlf(nkz.b(context.getResources().openRawResource(i)));
            if (m(nlfVar).booleanValue()) {
                return d(context, new ZipInputStream(new nle(nlfVar)), str);
            }
            return b(new nle(nlfVar), str);
        } catch (Resources.NotFoundException e) {
            return new cyr((Throwable) e);
        }
    }

    public static cyr d(Context context, ZipInputStream zipInputStream, String str) {
        cyr cyrVar;
        cyn cynVar;
        try {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                cyrVar = null;
                Object obj = null;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        nlf nlfVar = new nlf(nkz.b(zipInputStream));
                        String[] strArr = dep.a;
                        obj = k(new deq(nlfVar), null, false).a;
                    } else {
                        if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                            if (!name.contains(".ttf") && !name.contains(".otf")) {
                                zipInputStream.closeEntry();
                            }
                            String str2 = name.split("/")[r2.length - 1];
                            String str3 = str2.split("\\.")[0];
                            File file = new File(context.getCacheDir(), str2);
                            new FileOutputStream(file);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                    break;
                                }
                            } catch (Throwable th3) {
                                deu.b("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                            }
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                deu.a("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            hashMap2.put(str3, createFromFile);
                        }
                        hashMap.put(name.split("/")[r2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (obj == null) {
                    cyrVar = new cyr((Throwable) new IllegalArgumentException("Unable to parse composition"));
                } else {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str4 = (String) entry.getKey();
                        Iterator it = ((cyb) obj).b.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                cynVar = (cyn) it.next();
                                if (cynVar.d.equals(str4)) {
                                    break;
                                }
                            } else {
                                cynVar = null;
                                break;
                            }
                        }
                        if (cynVar != null) {
                            cynVar.e = dfb.c((Bitmap) entry.getValue(), cynVar.a, cynVar.b);
                        }
                    }
                    for (Map.Entry entry2 : hashMap2.entrySet()) {
                        boolean z = false;
                        for (dbk dbkVar : ((cyb) obj).c.values()) {
                            if (dbkVar.a.equals(entry2.getKey())) {
                                dbkVar.d = (Typeface) entry2.getValue();
                                z = true;
                            }
                        }
                        if (!z) {
                            deu.a("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                        }
                    }
                    if (hashMap.isEmpty()) {
                        Iterator it2 = ((cyb) obj).b.entrySet().iterator();
                        while (it2.hasNext()) {
                            cyn cynVar2 = (cyn) ((Map.Entry) it2.next()).getValue();
                            if (cynVar2 == null) {
                                break;
                            }
                            String str5 = cynVar2.d;
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                                try {
                                    byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                                    cynVar2.e = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                } catch (IllegalArgumentException e) {
                                    deu.b("data URL did not have correct base64 format.", e);
                                }
                            }
                        }
                    }
                    Iterator it3 = ((cyb) obj).b.entrySet().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it3.next();
                            if (((cyn) entry3.getValue()).e == null) {
                                cyrVar = new cyr((Throwable) new IllegalStateException("There is no image for ".concat(((cyn) entry3.getValue()).d)));
                                break;
                            }
                        } else {
                            if (str != null) {
                                dbo.a.a(str, (cyb) obj);
                            }
                            cyrVar = new cyr(obj);
                        }
                    }
                }
            } catch (IOException e2) {
                cyrVar = new cyr((Throwable) e2);
            }
            return cyrVar;
        } finally {
            dfb.e(zipInputStream);
        }
    }

    public static cyt e(Context context, String str, String str2) {
        return l(str2, new cye(context.getApplicationContext(), str, str2, 0));
    }

    public static cyt f(Context context, int i) {
        return g(context, i, i(context, i));
    }

    public static cyt g(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return l(str, new Callable() { // from class: cyd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map map = cyg.a;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return cyg.c(context2, i, str);
            }
        });
    }

    public static cyt h(final Context context, final String str, final String str2) {
        return l(str2, new Callable() { // from class: cyc
            /* JADX WARN: Can't wrap try/catch for region: R(12:58|(1:60)|61|(7:70|(1:72)(1:86)|(2:76|(1:78))|79|80|81|82)|87|(1:89)(1:91)|90|(3:74|76|(0))|79|80|81|82) */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:            if (r7 == null) goto L54;     */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x01c4, code lost:            r0 = move-exception;     */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x01c5, code lost:            defpackage.deu.b("LottieFetchResult close failed ", r0);     */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x019a A[Catch: all -> 0x0255, Exception -> 0x0258, TryCatch #2 {Exception -> 0x0258, blocks: (B:56:0x00e3, B:58:0x00e9, B:61:0x00fa, B:63:0x0102, B:65:0x010a, B:67:0x0112, B:70:0x0123, B:72:0x0127, B:74:0x016a, B:76:0x016e, B:78:0x019a, B:79:0x01be, B:86:0x013d, B:87:0x0142, B:89:0x0146, B:91:0x015d, B:92:0x01cd, B:94:0x01d1, B:97:0x0244, B:103:0x01d8, B:110:0x020f, B:117:0x0239, B:121:0x023b), top: B:55:0x00e3 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 651
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cyc.call():java.lang.Object");
            }
        });
    }

    public static String i(Context context, int i) {
        String str;
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        StringBuilder sb = new StringBuilder("rawRes");
        if (i2 != 32) {
            str = "_day_";
        } else {
            str = "_night_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((cyu) arrayList.get(i)).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x0328, code lost:            if (r0 < 0) goto L149;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x004a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.cyr k(defpackage.dep r32, java.lang.String r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyg.k(dep, java.lang.String, boolean):cyr");
    }

    private static cyt l(final String str, Callable callable) {
        cyb cybVar;
        if (str == null) {
            cybVar = null;
        } else {
            cybVar = (cyb) dbo.a.b.b(str);
        }
        if (cybVar != null) {
            return new cyt(new csf(cybVar, 5));
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (cyt) map.get(str);
            }
        }
        cyt cytVar = new cyt(callable);
        if (str != null) {
            final int i = 0;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i2 = 1;
            cytVar.e(new cyo() { // from class: cyf
                @Override // defpackage.cyo
                public final void a(Object obj) {
                    if (i2 != 0) {
                        cyg.a.remove(str);
                        atomicBoolean.set(true);
                        if (cyg.a.size() == 0) {
                            cyg.j();
                            return;
                        }
                        return;
                    }
                    cyg.a.remove(str);
                    atomicBoolean.set(true);
                    if (cyg.a.size() == 0) {
                        cyg.j();
                    }
                }
            });
            cytVar.d(new cyo() { // from class: cyf
                @Override // defpackage.cyo
                public final void a(Object obj) {
                    if (i != 0) {
                        cyg.a.remove(str);
                        atomicBoolean.set(true);
                        if (cyg.a.size() == 0) {
                            cyg.j();
                            return;
                        }
                        return;
                    }
                    cyg.a.remove(str);
                    atomicBoolean.set(true);
                    if (cyg.a.size() == 0) {
                        cyg.j();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = a;
                map2.put(str, cytVar);
                if (map2.size() == 1) {
                    j();
                }
            }
        }
        return cytVar;
    }

    private static Boolean m(nkr nkrVar) {
        try {
            nlf nlfVar = new nlf(new nlc(nkrVar));
            byte[] bArr = c;
            int length = bArr.length;
            for (int i = 0; i < 4; i++) {
                if (nlfVar.d() != bArr[i]) {
                    return false;
                }
            }
            nlfVar.close();
            return true;
        } catch (Exception unused) {
            int i2 = deu.a;
            return false;
        } catch (NoSuchMethodError unused2) {
            return false;
        }
    }
}
