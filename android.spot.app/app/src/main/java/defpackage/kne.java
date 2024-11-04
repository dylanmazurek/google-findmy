package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kne {
    public static kne a;

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) i;
            copyOf[31] = (byte) (i | 64);
            int length = bArr2.length;
            byte[][] bArr3 = kfe.a;
            if (length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                for (int i2 = 0; i2 < 7; i2++) {
                    if (MessageDigest.isEqual(kfe.a[i2], copyOf2)) {
                        throw new InvalidKeyException("Banned public key: ".concat(jql.r(kfe.a[i2])));
                    }
                }
                long[] l = kfl.l(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(l, 0, jArr2, 0, 10);
                int i3 = 0;
                for (int i4 = 32; i3 < i4; i4 = 32) {
                    int i5 = copyOf[31 - i3] & 255;
                    int i6 = 0;
                    while (i6 < 8) {
                        int i7 = (i5 >> (7 - i6)) & 1;
                        kfe.b(jArr4, jArr2, i7);
                        kfe.b(jArr5, jArr3, i7);
                        byte[] bArr4 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        int i8 = i5;
                        long[] jArr10 = new long[19];
                        long[] jArr11 = jArr;
                        long[] jArr12 = new long[19];
                        int i9 = i3;
                        long[] jArr13 = new long[19];
                        int i10 = i6;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = new long[19];
                        long[] jArr16 = jArr9;
                        long[] jArr17 = new long[19];
                        long[] jArr18 = new long[19];
                        kfl.j(jArr4, jArr4, jArr5);
                        kfl.i(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        kfl.j(jArr2, jArr2, jArr3);
                        kfl.i(jArr3, copyOf4, jArr3);
                        kfl.c(jArr14, jArr2, jArr5);
                        kfl.c(jArr15, jArr4, jArr3);
                        kfl.f(jArr14);
                        kfl.e(jArr14);
                        kfl.f(jArr15);
                        kfl.e(jArr15);
                        long[] jArr19 = jArr2;
                        System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                        kfl.j(jArr14, jArr14, jArr15);
                        kfl.i(jArr15, copyOf4, jArr15);
                        kfl.h(jArr18, jArr14);
                        kfl.h(jArr17, jArr15);
                        kfl.c(jArr15, jArr17, l);
                        kfl.f(jArr15);
                        kfl.e(jArr15);
                        System.arraycopy(jArr18, 0, jArr6, 0, 10);
                        System.arraycopy(jArr15, 0, jArr7, 0, 10);
                        kfl.h(jArr12, jArr4);
                        kfl.h(jArr13, jArr5);
                        kfl.c(jArr8, jArr12, jArr13);
                        kfl.f(jArr8);
                        kfl.e(jArr8);
                        kfl.i(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        kfl.g(jArr10, jArr13, 121665L);
                        kfl.e(jArr10);
                        kfl.j(jArr10, jArr10, jArr12);
                        kfl.c(jArr16, jArr13, jArr10);
                        kfl.f(jArr16);
                        kfl.e(jArr16);
                        kfe.b(jArr8, jArr6, i7);
                        kfe.b(jArr16, jArr7, i7);
                        i6 = i10 + 1;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        i5 = i8;
                        jArr = jArr11;
                        i3 = i9;
                        jArr6 = jArr19;
                        jArr5 = jArr16;
                        copyOf = bArr4;
                        long[] jArr20 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr20;
                        long[] jArr21 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr21;
                    }
                    i3++;
                    copyOf = copyOf;
                }
                long[] jArr22 = jArr;
                long[] jArr23 = new long[10];
                kfl.a(jArr23, jArr5);
                kfl.b(jArr22, jArr4, jArr23);
                long[] jArr24 = new long[10];
                long[] jArr25 = new long[10];
                long[] jArr26 = new long[11];
                long[] jArr27 = new long[11];
                long[] jArr28 = new long[11];
                kfl.b(jArr24, l, jArr22);
                kfl.j(jArr25, l, jArr22);
                long[] jArr29 = new long[10];
                jArr29[0] = 486662;
                kfl.j(jArr27, jArr25, jArr29);
                kfl.b(jArr27, jArr27, jArr3);
                kfl.j(jArr27, jArr27, jArr2);
                kfl.b(jArr27, jArr27, jArr24);
                kfl.b(jArr27, jArr27, jArr2);
                kfl.g(jArr26, jArr27, 4L);
                kfl.e(jArr26);
                kfl.b(jArr27, jArr24, jArr3);
                kfl.i(jArr27, jArr27, jArr3);
                kfl.b(jArr28, jArr25, jArr2);
                kfl.j(jArr27, jArr27, jArr28);
                kfl.h(jArr27, jArr27);
                if (MessageDigest.isEqual(kfl.k(jArr26), kfl.k(jArr27))) {
                    return kfl.k(jArr22);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(jql.r(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return a(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static String c(kmq kmqVar) {
        int ordinal = kmqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return "SHA-512";
                        }
                        throw new GeneralSecurityException("Unsupported hash ".concat(kmqVar.toString()));
                    }
                    return "SHA-384";
                }
                return "SHA-256";
            }
            return "SHA-224";
        }
        return "SHA-1";
    }

    public static String d(kmq kmqVar) {
        kna.d(kmqVar);
        return kmqVar.toString().concat("withECDSA");
    }

    public static byte[] e(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        Mac mac = (Mac) kmn.b.a(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr2 != null && bArr2.length != 0) {
                mac.init(new SecretKeySpec(bArr2, str));
            } else {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            }
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
            byte[] bArr5 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update(bArr3);
                mac.update((byte) i2);
                bArr5 = mac.doFinal();
                int length = bArr5.length;
                int i4 = i3 + length;
                if (i4 < i) {
                    System.arraycopy(bArr5, 0, bArr4, i3, length);
                    i2++;
                    i3 = i4;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                    return bArr4;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Set, java.lang.Object] */
    public static void f(List list) {
        Set<kpb> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                knu knuVar = (knu) it.next();
                kpb kpbVar = new kpb(knuVar);
                for (kon konVar : knuVar.b) {
                    kob kobVar = new kob(konVar, !knuVar.f());
                    if (!hashMap.containsKey(kobVar)) {
                        hashMap.put(kobVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(kobVar);
                    if (!set2.isEmpty() && !kobVar.a) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", konVar));
                    }
                    set2.add(kpbVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (kpb kpbVar2 : (Set) it2.next()) {
                        for (koc kocVar : ((knu) kpbVar2.b).c) {
                            if (kocVar.a() && (set = (Set) hashMap.get(new kob(kocVar.a, kocVar.b()))) != null) {
                                for (kpb kpbVar3 : set) {
                                    kpbVar2.c.add(kpbVar3);
                                    kpbVar3.a.add(kpbVar2);
                                }
                            }
                        }
                    }
                }
                HashSet<kpb> hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (kpb kpbVar4 : hashSet) {
                    if (kpbVar4.j()) {
                        hashSet2.add(kpbVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    kpb kpbVar5 = (kpb) hashSet2.iterator().next();
                    hashSet2.remove(kpbVar5);
                    i++;
                    for (kpb kpbVar6 : kpbVar5.c) {
                        kpbVar6.a.remove(kpbVar5);
                        if (kpbVar6.j()) {
                            hashSet2.add(kpbVar6);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (kpb kpbVar7 : hashSet) {
                    if (!kpbVar7.j() && !kpbVar7.c.isEmpty()) {
                        arrayList.add(kpbVar7.b);
                    }
                }
                throw new kod(arrayList);
            }
        }
    }

    public static final void g(knu knuVar, List list) {
        list.add(knuVar);
    }

    public static final void h(ComponentRegistrar componentRegistrar, List list) {
        list.add(new knz(componentRegistrar, 0));
    }

    public static ComponentRegistrar i(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new kog(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new kog(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new kog(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new kog(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new kog(String.format("Could not instantiate %s", str), e4);
        }
    }

    public static kqz j(knv knvVar, Class cls) {
        return knvVar.a(new kon(kom.class, cls));
    }

    public static Object k(knv knvVar, kon konVar) {
        kqz a2 = knvVar.a(konVar);
        if (a2 == null) {
            return null;
        }
        return a2.a();
    }

    public static Object l(knv knvVar, Class cls) {
        return k(knvVar, new kon(kom.class, cls));
    }

    public static Set m(knv knvVar, Class cls) {
        kon konVar = new kon(kom.class, cls);
        kop kopVar = (kop) knvVar;
        if (kopVar.a.contains(konVar)) {
            return (Set) kopVar.b.c(konVar).a();
        }
        throw new koe(String.format("Attempting to request an undeclared dependency Set<%s>.", konVar));
    }

    public static String n(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String o(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String p(Bundle bundle) {
        String string = bundle.getString("from");
        if (string != null && string.startsWith("/topics/")) {
            return string;
        }
        return null;
    }

    public static void q(String str, Bundle bundle) {
        String str2;
        String str3;
        try {
            knh.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String n = n(bundle);
            if (n != null) {
                bundle2.putString("_nmn", n);
            }
            String o = o(bundle);
            if (!TextUtils.isEmpty(o)) {
                bundle2.putString("label", o);
            }
            String string2 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string2)) {
                bundle2.putString("message_channel", string2);
            }
            String p = p(bundle);
            if (p != null) {
                bundle2.putString("_nt", p);
            }
            String string3 = bundle.getString("google.c.a.ts");
            if (string3 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string3));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str2 = bundle.getString("google.c.a.udt");
            } else {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str2));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            if (true != ktd.m(bundle)) {
                str3 = "data";
            } else {
                str3 = "display";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str3);
            }
            knn knnVar = (knn) knh.b().e(knn.class);
            if (knnVar != null) {
                knnVar.a();
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static boolean s(Intent intent) {
        if (intent != null && !r(intent)) {
            return t(intent.getExtras());
        }
        return false;
    }

    public static boolean t(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static final void u(bpm bpmVar, ksi ksiVar) {
        if (ksiVar != null) {
            try {
                fxs fxsVar = ksiVar.c;
                fma.aR(fxsVar);
                Bitmap bitmap = (Bitmap) fma.q(fxsVar, 5L, TimeUnit.SECONDS);
                bpmVar.l(bitmap);
                bpj bpjVar = new bpj();
                bpjVar.d(bitmap);
                bpjVar.c(null);
                bpmVar.n(bpjVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                ksiVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(String.valueOf(e.getCause()))));
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                ksiVar.close();
            }
        }
    }

    public static int v(int i) {
        return i - 1;
    }

    public static void w(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            bundle2.putString(str2, string);
        }
    }

    public static void x(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void y(Object obj) {
        obj.getClass();
    }
}
