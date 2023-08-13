/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Request info to enable or disable an entity.
 * 
 * <h5>Description</h5>
 * 
 * <p>Enables or disables the specified component for the specified spatial entity.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using {@link XrSpaceComponentStatusSetInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntity#XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code componentType} <b>must</b> be a valid {@code XrSpaceComponentTypeFB} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBSpatialEntity#xrSetSpaceComponentStatusFB SetSpaceComponentStatusFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceComponentStatusSetInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpaceComponentTypeFB {@link #componentType};
 *     XrBool32 {@link #enabled};
 *     XrDuration {@link #timeout};
 * }</code></pre>
 */
public class XrSpaceComponentStatusSetInfoFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COMPONENTTYPE,
        ENABLED,
        TIMEOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COMPONENTTYPE = layout.offsetof(2);
        ENABLED = layout.offsetof(3);
        TIMEOUT = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrSpaceComponentStatusSetInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceComponentStatusSetInfoFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the component whose status is to be set. */
    @NativeType("XrSpaceComponentTypeFB")
    public int componentType() { return ncomponentType(address()); }
    /** the value to set the component to. */
    @NativeType("XrBool32")
    public boolean enabled() { return nenabled(address()) != 0; }
    /** the number of nanoseconds before the operation should be cancelled. A value of {@link XR10#XR_INFINITE_DURATION INFINITE_DURATION} indicates to never time out. See <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#duration">duration</a> for more details. */
    @NativeType("XrDuration")
    public long timeout() { return ntimeout(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceComponentStatusSetInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntity#XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB} value to the {@link #type} field. */
    public XrSpaceComponentStatusSetInfoFB type$Default() { return type(FBSpatialEntity.XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceComponentStatusSetInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #componentType} field. */
    public XrSpaceComponentStatusSetInfoFB componentType(@NativeType("XrSpaceComponentTypeFB") int value) { ncomponentType(address(), value); return this; }
    /** Sets the specified value to the {@link #enabled} field. */
    public XrSpaceComponentStatusSetInfoFB enabled(@NativeType("XrBool32") boolean value) { nenabled(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #timeout} field. */
    public XrSpaceComponentStatusSetInfoFB timeout(@NativeType("XrDuration") long value) { ntimeout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceComponentStatusSetInfoFB set(
        int type,
        long next,
        int componentType,
        boolean enabled,
        long timeout
    ) {
        type(type);
        next(next);
        componentType(componentType);
        enabled(enabled);
        timeout(timeout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceComponentStatusSetInfoFB set(XrSpaceComponentStatusSetInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceComponentStatusSetInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceComponentStatusSetInfoFB malloc() {
        return wrap(XrSpaceComponentStatusSetInfoFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSpaceComponentStatusSetInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceComponentStatusSetInfoFB calloc() {
        return wrap(XrSpaceComponentStatusSetInfoFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSpaceComponentStatusSetInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceComponentStatusSetInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSpaceComponentStatusSetInfoFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceComponentStatusSetInfoFB} instance for the specified memory address. */
    public static XrSpaceComponentStatusSetInfoFB create(long address) {
        return wrap(XrSpaceComponentStatusSetInfoFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceComponentStatusSetInfoFB createSafe(long address) {
        return address == NULL ? null : wrap(XrSpaceComponentStatusSetInfoFB.class, address);
    }

    /**
     * Returns a new {@link XrSpaceComponentStatusSetInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusSetInfoFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceComponentStatusSetInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusSetInfoFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceComponentStatusSetInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusSetInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSpaceComponentStatusSetInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusSetInfoFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceComponentStatusSetInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceComponentStatusSetInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceComponentStatusSetInfoFB malloc(MemoryStack stack) {
        return wrap(XrSpaceComponentStatusSetInfoFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSpaceComponentStatusSetInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceComponentStatusSetInfoFB calloc(MemoryStack stack) {
        return wrap(XrSpaceComponentStatusSetInfoFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSpaceComponentStatusSetInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusSetInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceComponentStatusSetInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusSetInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceComponentStatusSetInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceComponentStatusSetInfoFB.NEXT); }
    /** Unsafe version of {@link #componentType}. */
    public static int ncomponentType(long struct) { return UNSAFE.getInt(null, struct + XrSpaceComponentStatusSetInfoFB.COMPONENTTYPE); }
    /** Unsafe version of {@link #enabled}. */
    public static int nenabled(long struct) { return UNSAFE.getInt(null, struct + XrSpaceComponentStatusSetInfoFB.ENABLED); }
    /** Unsafe version of {@link #timeout}. */
    public static long ntimeout(long struct) { return UNSAFE.getLong(null, struct + XrSpaceComponentStatusSetInfoFB.TIMEOUT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceComponentStatusSetInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceComponentStatusSetInfoFB.NEXT, value); }
    /** Unsafe version of {@link #componentType(int) componentType}. */
    public static void ncomponentType(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceComponentStatusSetInfoFB.COMPONENTTYPE, value); }
    /** Unsafe version of {@link #enabled(boolean) enabled}. */
    public static void nenabled(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceComponentStatusSetInfoFB.ENABLED, value); }
    /** Unsafe version of {@link #timeout(long) timeout}. */
    public static void ntimeout(long struct, long value) { UNSAFE.putLong(null, struct + XrSpaceComponentStatusSetInfoFB.TIMEOUT, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceComponentStatusSetInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceComponentStatusSetInfoFB, Buffer> implements NativeResource {

        private static final XrSpaceComponentStatusSetInfoFB ELEMENT_FACTORY = XrSpaceComponentStatusSetInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceComponentStatusSetInfoFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceComponentStatusSetInfoFB#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrSpaceComponentStatusSetInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceComponentStatusSetInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceComponentStatusSetInfoFB.ntype(address()); }
        /** @return the value of the {@link XrSpaceComponentStatusSetInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceComponentStatusSetInfoFB.nnext(address()); }
        /** @return the value of the {@link XrSpaceComponentStatusSetInfoFB#componentType} field. */
        @NativeType("XrSpaceComponentTypeFB")
        public int componentType() { return XrSpaceComponentStatusSetInfoFB.ncomponentType(address()); }
        /** @return the value of the {@link XrSpaceComponentStatusSetInfoFB#enabled} field. */
        @NativeType("XrBool32")
        public boolean enabled() { return XrSpaceComponentStatusSetInfoFB.nenabled(address()) != 0; }
        /** @return the value of the {@link XrSpaceComponentStatusSetInfoFB#timeout} field. */
        @NativeType("XrDuration")
        public long timeout() { return XrSpaceComponentStatusSetInfoFB.ntimeout(address()); }

        /** Sets the specified value to the {@link XrSpaceComponentStatusSetInfoFB#type} field. */
        public XrSpaceComponentStatusSetInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceComponentStatusSetInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntity#XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB} value to the {@link XrSpaceComponentStatusSetInfoFB#type} field. */
        public XrSpaceComponentStatusSetInfoFB.Buffer type$Default() { return type(FBSpatialEntity.XR_TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB); }
        /** Sets the specified value to the {@link XrSpaceComponentStatusSetInfoFB#next} field. */
        public XrSpaceComponentStatusSetInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpaceComponentStatusSetInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceComponentStatusSetInfoFB#componentType} field. */
        public XrSpaceComponentStatusSetInfoFB.Buffer componentType(@NativeType("XrSpaceComponentTypeFB") int value) { XrSpaceComponentStatusSetInfoFB.ncomponentType(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceComponentStatusSetInfoFB#enabled} field. */
        public XrSpaceComponentStatusSetInfoFB.Buffer enabled(@NativeType("XrBool32") boolean value) { XrSpaceComponentStatusSetInfoFB.nenabled(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrSpaceComponentStatusSetInfoFB#timeout} field. */
        public XrSpaceComponentStatusSetInfoFB.Buffer timeout(@NativeType("XrDuration") long value) { XrSpaceComponentStatusSetInfoFB.ntimeout(address(), value); return this; }

    }

}